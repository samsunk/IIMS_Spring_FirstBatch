package np.iims.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import np.iims.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	int std_rollno=101;
    	String std_name="mahesh";
    	float std_marks=90.5f;
        
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
    	
    	String insert_sql_query="insert into student values(?,?,?)";
    	
    	int count=jdbcTemplate.update(insert_sql_query,std_rollno,std_name,std_marks);
    	
    	if(count>0) {
    		System.out.println("insertion success");
    		
    	}else {
    		System.out.println("insertion failed");
    	}
    }
}
