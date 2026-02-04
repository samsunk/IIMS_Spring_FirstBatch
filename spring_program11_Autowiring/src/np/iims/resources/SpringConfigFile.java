package np.iims.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import np.iims.beans.Address;
import np.iims.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj1() {
		Address addr=new Address();
		addr.setCity("Kathmandu");
		addr.setHouseno(1234);
		addr.setPinCode(44600);
		return addr;
	}
	
	@Bean
	public Address createAddrObj2() {
		Address addr=new Address();
		addr.setCity("Pokhara");
		addr.setHouseno(1235);
		addr.setPinCode(44700);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setName("Mahesh");
		std.setRollno(101);
		//std.setAddress(createAddrObj());// manual DI
		return std;
	}

}
