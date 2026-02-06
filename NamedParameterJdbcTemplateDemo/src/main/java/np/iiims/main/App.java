package np.iiims.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import np.iiims.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	NamedParameterJdbcTemplate npNamedParameterJdbcTemplate=context.getBean(NamedParameterJdbcTemplate.class);
    	
    	Map<String,Object> map=new HashMap<String,Object>();
    	map.put("key_rollno", 104);
    	map.put("key_name","Rahul");
    	map.put("key_marks", 88.88f);
    	
    	
    	String insert_sql_query="insert into student values(:key_rollno,:key_name,:key_marks)";
    	
    	int count=npNamedParameterJdbcTemplate.update(insert_sql_query, map);
    	
    	if(count>0) {
    		System.out.println("success");
    	}else {
    		System.out.println("failed");
    	}
    	
    	
    }
}
