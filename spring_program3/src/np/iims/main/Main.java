package np.iims.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import np.iims.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String path="/np/iims/resources/applicationContext.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(path);
		
		Student std=(Student)context.getBean("student");
		std.display();
		
	}

}
