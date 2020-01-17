package Order;


public class CreditCard {
	private String Company;
	private int CardNumber;
	private int ExDate;
	private int SecCode;

	public String getCompany() {
		return Company;
	}

	public int getCardNumber() {
		return CardNumber;
	}

	public int getExDate() {
		return ExDate;
	}

	public int getSecCode() {
		return SecCode;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}

	public void setCardNumber(int CardNumber) {
		this.CardNumber = CardNumber;
	}

	public void setExDate(int ExDate) {
		this.ExDate = ExDate;
	}

	public void setSecCode(int SecCode) {
		this.SecCode = SecCode;
	}

	public  void AddPayment() {
		// TODO should be implemented
	}
}
