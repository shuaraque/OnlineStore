package Order; 

public class Shipping {
	private String Address;
	private  String ShippingComp;
	private  int ConNum;

	public String getAddress() {
		return this.Address;
	}

	public String getShippingComp() {
		return this.ShippingComp;
	}

	public int getConNum() {
		return this.ConNum;
	}

	public void setAddress( String Address) {
		this.Address = Address;
	}

	public void setShippingComp( String ShippingComp) {
		this.ShippingComp = ShippingComp;
	}

	public void setConNum( int ConNum) {
		this.ConNum = ConNum;
	}

	public String OrderStatus( ) {
		// TODO should be implemented
		return "";
	}
}
