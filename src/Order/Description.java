package Order;


public class Description {
//instance fields
	private String name;
	private int price;
	private String ColorList;
	private String CategoryList;
	private String SizeList;
	
	public void Description(){
		
	}
	
	//mutators
	public void setName(String n) {
		name = n;
	}
	public void setPrice(int i){
		price = i; 
		
	}
	public void addColor(String c ){
		ColorList = c;
	}
	public void removeColor(String remoco)
	{
		ColorList = remoco;
	}
	public void addCategory(String cate)
	{
		CategoryList = cate;
	}
	public void removeCategory(String remocate)
	{
		CategoryList = remocate;
	}
	public void addSize(String s)
	{
		SizeList = s;
	}
	public void removeSize(String remos)
	{
		SizeList = remos;
	}
	/*public void setPhoto(String ph)
	{
		PictureFile = ph;
	}*/
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return ColorList;
	}
	public String getCategory()
	{
		return CategoryList;
	}
	public String getSize()
	{
		return SizeList;
	}
	/*public String getPhoto()
	{
		return PictureFile;
	}*/
}
