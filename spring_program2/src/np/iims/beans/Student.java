package np.iims.beans;

/**
 * This spring program is using Java Configuration
 * @author Samsunk
 *
 */

public class Student {
	private String name;
	private int rollno;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Name:"+getName()+"\nRoll No:"+getRollno()+"\nEmail:"+getEmail();
	}

}
