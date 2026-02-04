package np.iims.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import np.iims.resources.SpringConfigFile;
import np.iims.beans.*;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	Student std=context.getBean(Student.class);
	std.display();
}
}
