package np.iims.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int houseno;
	private String city;
	private int pinCode;
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public String toString() {
		return "#"+houseno+"|"+city+"|"+pinCode;
	}

}
