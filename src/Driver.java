
//package com.journaldev.readfileslinebyline;

import Order.*;
import People.*;
//import Order.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 

public class Driver {
	
	private static ArrayList<Item> items = new ArrayList<Item>();
	private static ArrayList<Item> itemInCart = new ArrayList<Item>();
	private static ShoppingCart shoppingCart;
	
	public Driver(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreGUI gui;
		Guest guest = new Guest();
		System.out.println("**********HeLLoO********");
		System.out.println("Be a member of our custemers! type yes or y to be a member!");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//sc.close();
		if(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes")) {
			System.out.println("We are happy you want to join our family!\n"
					+ "Please enter your infomation to set your account up!");
			ArrayList<String> info = getMemberInfo(guest);
			Member member = new Member(info.get(0), info.get(1),
					info.get(2), info.get(3), info.get(4), info.get(5));
			memberShopping(member);
		}
		else{
			guestShopping(guest);
		}
		
		
		gui = new StoreGUI("jj" , items, itemInCart);

	}
	public static ArrayList<String> getMemberInfo(Guest guest) {
		Scanner scan = new Scanner(System.in);
		String x;
		ArrayList<String> info =new ArrayList<String>();
		
		do{
			System.out.println("Enter first and last name:");
			x=scan.nextLine();
		}while(!guest.verifyName(x));
		info.add(x);
		
		do{
			System.out.println("Enter username");
			x=scan.nextLine();
		}while(!guest.verifyUsername(x));
		info.add(x);
		
		do{
			System.out.println("Enter password");
			x=scan.nextLine();
		}while(!guest.verifyPassword(x));
		info.add(x);
		
		do{
			System.out.println("Enter Email");
			x=scan.nextLine();
		}while(!guest.verifyEmail(x));
		info.add(x);
		
		do{
			System.out.println("Enter Addres");
			x=scan.nextLine();
		}while(!guest.verifyAddress(x));
		info.add(x);
		
		do{
			System.out.println("Enter Birthday");
			x=scan.nextLine();
		}while(!guest.verifyBirthday(x));
		info.add(x);
		return info;
	}
	
	public static void memberShopping(Member member) {
		getItems();
		showItems();
		sellectItems();
	}
	public static void guestShopping(Guest guest) {
		getItems();
		showItems();
		//sellectItems();

	}
	
	public static void getItems() {
		String[] s;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("sale_items/items.txt"));
			String line = reader.readLine();
			while (line != null) {
				s=line.split(",");
				Item item = new Item(s[0], s[1], Double.parseDouble(s[2]), 
						Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5]));
				items.add(item);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void showItems() {
		int i=1;
		System.out.println("#) Item \tPrice \tDiscription");
		for(Item x : items) {
			System.out.println(i+") "+x.getName()+"\t"+ x.getPrice() +"\t"+x.getDisrcription()+"\t"+x.getSizes());
			i++;
		}
	}
	public static void sellectItems() {
		System.out.print("sellect item or press any letter key to exsit!");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		while(!(x.matches("[a-zA-Z]+"))){
			if(Integer.parseInt(x)<items.size()) {
				itemInCart.add(items.get(Integer.parseInt(x)-1));
			}else {
				System.out.print("Item doent exist");
			}
			System.out.println("Items in shoppingcart ");
			showShoppingCart();
			System.out.println("");
			System.out.println("Items in store");
			showItems();
			System.out.println("");
			System.out.print("sellect another item or press any letter key to exite! ");
			x = scan.nextLine();
			
		}

	}
	public static void showShoppingCart(){
		int i=0;
		for(Item x : itemInCart) {
			System.out.println(i+") "+x.getName().toString()+"\t"+ x.getPrice() +"\t"+x.getDisrcription());
			i++;
		}
	}
}
