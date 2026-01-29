package np.iims.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import np.iims.beans.*;

public class Main {
	public static void main(String[] args) {
		
		String path="/np/iims/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(path);
		
		Student s=(Student)context.getBean("stdId");
		s.display();
		
	}

}

// 1. spring-beans-xxx.jar
// 2. spring-core-xxx.jar
// 3. spring-context-xxx.jar
// 4. common-logging-xxx.jar
// 5. spring-expression-xxx.jar

