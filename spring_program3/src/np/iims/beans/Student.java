package np.iims.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * Annotation Based confiuration: XML based
 * @author Samsunk
 *
 */

@Component
public class Student {
	@Value("Hitesh")
	private String name;
	@Value("1000")
	private int rollno;
	@Value("95.00")
	private float marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Roll No: "+getRollno());
		System.out.println("Marks: "+getMarks());
	}

}
