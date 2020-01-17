package People;

import java.util.ArrayList;

public  class Person {
	private String name, email, address, birthday;
	private ArrayList<String> memberInfo=new ArrayList<String>();
	
	public void setName (String aName) {
		name=aName;
	}
	public void setEmail (String aEmail) {
		email=aEmail ;
	}
	public void setAddress (String aAddress) {
		address=aAddress ;
	}
	public void setBirthday(String aBirthday) {
		birthday=aBirthday ;
	}
	public String getName () {
		return name;
	}
	public String getEmail () {
		return email;
	}
	public String getAddress () {
		return address;
	}
	public String getBirthday () {
		return birthday;
	}
	
	public boolean verifyName(String name) {
		return name.matches("[a-zA-Z\\\\s\\'\\\"]+");
	}
	public boolean verifyUsername(String usename) {
		return true;
	}
	public boolean verifyAddress(String address) {
		
		return address.length()>3;
	}
	public boolean verifyEmail(String email) {
		
		
		return email.contains("@") && email.contains(".") ;
	}
	public boolean verifyBirthday(String birthday) {
		
		return true;
	}
	public boolean verifyPassword(String password) {
		
		return password.length()>4;
	}
	public boolean verify(String x) {
		
		return false;
	}
	
	
	
	
	

}
