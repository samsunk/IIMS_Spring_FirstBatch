package np.iims.MavenFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import np.iims.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      String path="/np/iims/resources/applicationContext.xml";
      
      ApplicationContext context=new ClassPathXmlApplicationContext(path);
      
      Student std=context.getBean(Student.class);
      std.display();
    }
}
