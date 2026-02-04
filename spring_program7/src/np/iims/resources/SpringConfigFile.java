package np.iims.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import np.iims.beans.Address;
import np.iims.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		addr.setCity("Kathmandu");
		addr.setHouseno(101);
		addr.setPinCode(256);
		return addr;
	}
	
	@Bean
	public Student creatStdObj() {
		Student std=new Student();
		
		std.setRollno(101);
		std.setName("Deepak");
		std.setAddress(createAddrObj());
		
		return std;
	}

}
