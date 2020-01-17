package Order;

import People.*;

import java.util.ArrayList;

public class ShoppingCart {
private int SubPrice, Tax, TotalPrice;
private Person Person;
private ArrayList<Item> ItemsList = new ArrayList<Item>();

private ShoppingCart(){
	
}

public void setSubPrice(int price) {
	SubPrice = price;
}
public void setTax (int tax) {
	Tax = tax;
}


public void setPerson (Person person) {
	Person = person;
}

public void addItem(Item product) {
	ItemsList.add(product);
}

public void removeItem(Item product) {
	ItemsList.remove(product);
}

public int getSubPrice () {
	return SubPrice;
}

public int getTax() {
	return Tax;
}

public int getTotalPrice() {
	TotalPrice=0;
	for(Item x : ItemsList) {
		TotalPrice+=x.getPrice();
	}
	return TotalPrice;
}

public Person getPerson() {
	return Person;
}

public ArrayList<Item> getItemsList(){
	return ItemsList;
}


}
