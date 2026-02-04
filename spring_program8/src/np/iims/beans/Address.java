package np.iims.beans;

public class Address {
	private String city;
	private int houseno;
	private int pinCode;
	
	
	
	public Address(String city, int houseno, int pinCode) {
		super();
		this.city = city;
		this.houseno = houseno;
		this.pinCode = pinCode;
	}



	public String toString() {
		return "|City: "+city+", House No: "+houseno+", PinCode: |"+pinCode;
	}

}
