package np.iims.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import np.iims.beans.Address;
import np.iims.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address("Kathmandu",256,1234);
		
		return addr;
	}
	
	@Bean
	public Student creatStdObj() {
		Student std=new Student(101,"Ramesh",createAddrObj());
		
		
		
		return std;
	}

}
