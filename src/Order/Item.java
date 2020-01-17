package Order;


public class Item {
	private String name;
	private double price;
	private String discription;
	private int s, m, l;
	private String CategoryList;
	private String SizeList;
	
	public Item(){}
	public Item(String aname, String adiscription, double aprice, int x, int y, int z){
		name= aname;
		price=aprice;
		discription=adiscription;
		s=x; m=y; z=l; 
	}
	public void setName(String n) {
		name = n;
	}
	public void setPrice(double i){
		price = i; 
	}
	public void setSize(int x, int y, int z) {
		s=x; m=y; z=l; 
	}
	public void addCategory(String cate){
		CategoryList = cate;
	}
	public void removeCategory(String remocate){
		CategoryList = remocate;
	}
	public void addSize(String s){
		SizeList = s;
	}
	public void removeSize(String remos){
		SizeList = remos;
	}

	public String getName(){
		return name;
	}
	public String getSizes() {
		return String.valueOf(s)+" in small, " + String.valueOf(m)+" in m, " + String.valueOf(s) + " in large " ;
	}
	public double getPrice(){
		return price;
	}
	public String getDisrcription() {
		return discription; 
	}
	public String getCategory(){
		return CategoryList;
	}
	public String getSize(){
		return SizeList;
	}
	

}
