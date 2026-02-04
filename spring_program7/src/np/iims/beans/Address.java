package np.iims.beans;

public class Address {
	private String city;
	private int houseno;
	private int pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public String toString() {
		return "|City: "+getCity()+", House No: "+getHouseno()+", PinCode: |"+getPinCode();
	}

}
