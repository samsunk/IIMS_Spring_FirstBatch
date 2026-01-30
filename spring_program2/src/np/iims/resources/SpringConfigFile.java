package np.iims.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import np.iims.beans.*;
/**
 * This class is Java Configuration File
 * @author Samsunk
 *
 */
@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId1() {
	Student std=new Student();
	std.setName("Ramesh");
	std.setRollno(100);
	std.setEmail("Ramesh@gmail.com");
	return std;
	}
	

}
