package People;

public class Member extends Person {
	private String username, password, registrationDate;
	
	public Member() {
		
	}
	public Member(String name, String username, String password, 
			String email, String address, String birthday) {
		setName(name); 
		this.username=username;
		this.password=password; 
		this.registrationDate=java.time.LocalDateTime.now().toString(); 
		setEmail(email);
		setAddress(address);
		setBirthday(birthday);
	}
	public void setPassword(String aPassword) {
		password=(aPassword) ;
	}
	public void setUername(String aUsername) {
		username=aUsername;
	}
	public void setRegistrationDate(String aRegistrationDate) {
		registrationDate=aRegistrationDate ;
	}
	
	
	

}
