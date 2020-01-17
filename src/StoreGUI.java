

import Order.*;
import People.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;  


import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.awt.Button;
import java.awt.Dimension;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.awt.event.ActionEvent;
import javax.swing.*;



public class StoreGUI {
	
	private JMenuBar mainMenu;
	private JMenu fileMenu, shoppingCart;
	private JMenuItem saveMenu, loadMenu, menuExit, addCourseMenu, menuDropCourse, printSchedule, shopping;
	private JFrame mainFram;
	private JLabel storeLable, storeLable1;
	private ArrayList<JLabel> itmeLables = new ArrayList<JLabel>();
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Item> itemInCart = new ArrayList<Item>();

	public StoreGUI(String title, ArrayList<Item> items, ArrayList<Item> itemInCart) {
		this.items=items;
		this.itemInCart=itemInCart;
		int x=0, y=0;
		mainMenu = new JMenuBar();
		fileMenu = new JMenu("File");
		shoppingCart = new JMenu("Shopping Cart");

		saveMenu = new JMenuItem("Save");
		loadMenu = new JMenuItem("Load");
		menuExit = new JMenuItem("Exit");
		saveMenu.addActionListener(new MenuListener());
		loadMenu.addActionListener(new MenuListener());
		menuExit.addActionListener(new MenuListener());
		
		addCourseMenu = new JMenuItem("Add Course");
		menuDropCourse = new JMenuItem("Drop Course");
		printSchedule = new JMenuItem("Print Schedule");
		addCourseMenu.addActionListener(new MenuListener());
		menuDropCourse.addActionListener(new MenuListener());
		printSchedule.addActionListener(new MenuListener());
		
		fileMenu.add(saveMenu);
		fileMenu.add(loadMenu);
		fileMenu.add(menuExit);
		shopping = new JMenuItem("Shopping Cart");
		shopping.addActionListener(new MenuListener());
    	shoppingCart.add(shopping);
		mainMenu.add(fileMenu);
		mainMenu.add(shoppingCart);
		mainFram = new JFrame(title);
		mainFram.setJMenuBar(mainMenu);
		JPanel container = new JPanel();
		container.setPreferredSize(new Dimension(2000, 1500));
		for(Item item: items) {
			itmeLables.add(new JLabel(new ImageIcon("sale_items/"+item.getName()+".png")));
			itmeLables.get(itmeLables.size()-1).setBounds(x, y, 500, 600);
			itmeLables.get(itmeLables.size()-1).addMouseListener(new MouseAdapter(){
			    public void mouseReleased(MouseEvent e){
			        if (e.isPopupTrigger()){
			            openItemPanal(item);
			        }
			    }
			});
			x= ((x+510));
			if(x>2000) {
				x=0;
				y+=610;
			}
			container.add(itmeLables.get(itmeLables.size()-1));
		}
		JScrollPane pane = new JScrollPane(container);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mainFram.add(pane);
        mainFram.setSize(3000, 2000);
		mainFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFram.setVisible(true);
	}
	private void openItemPanal(Item item) {
		JFrame mainFram1 = new JFrame(item.getName());
		JLabel lab = new JLabel(new ImageIcon("sale_items/"+item.getName()+".png"));
		JButton button = new JButton("Add to Cart");
		button.setBounds(1000, 700, 160, 30);
		lab.setText(item.getDisrcription());
		mainFram1.add(button);
		mainFram1.add(lab);
		button.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    ButtonPressed(item, lab);
			  } 
			});
		mainFram1.setSize(1500, 1000);
		mainFram1.setVisible(true);	
	}

	public void ButtonPressed(Item item, JLabel lab){
		JPanel panelCourseOption = new JPanel(new GridLayout(3, 2));
		JLabel studentNameField = new JLabel("Student name:");
		JLabel depatrmentField = new JLabel("Department:");
		JLabel courseNumber = new JLabel("Course #:");
		int select = JOptionPane.showConfirmDialog(null, panelCourseOption, selection + " Course",
				JOptionPane.OK_CANCEL_OPTION);
		lab.setText(lab.getText()+" item added to cart!");
		itemInCart.add(item);
	}
	private class MenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JMenuItem event = (JMenuItem) (e.getSource());
			if (event.equals(saveMenu)) {
				
			} 
			else if (event.equals(loadMenu)) {
			}
			else if (event.equals(menuExit)) {
				mainFram.dispose();
			} 
			else if (event.equals(shopping)){
				int x=0, y=0;
				JPanel container = new JPanel();
				container.setPreferredSize(new Dimension(2000, 1500));
				for(Item item: itemInCart) {
					itmeLables.add(new JLabel(new ImageIcon("sale_items/"+item.getName()+".png")));
					itmeLables.get(itmeLables.size()-1).setBounds(x, y, 500, 600);
					x= ((x+510));
					if(x>2000) {
						x=0;
						y+=610;
					}
					container.add(itmeLables.get(itmeLables.size()-1));
				}
				JFrame shoppingCartFrame = new JFrame("Shopping Cart");
				shoppingCartFrame.add(container);
				shoppingCartFrame.setSize(3000, 2000);
				shoppingCartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				shoppingCartFrame.setVisible(true);
				
			}
		}

	}
	
	
	
	

}
