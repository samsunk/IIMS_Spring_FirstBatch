package np.iims.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import np.iims.beans.Address;
import np.iims.beans.Student;
import np.iims.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		addr.setCity("Kathmandu");
		addr.setHouseno(1234);
		addr.setPinCode(44600);
		return addr;
	}
	
	@Bean
	public Subjects createSubObj() {
		Subjects subj=new Subjects();
		
		List<String> subjects_list=new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Advanced Java");
		subjects_list.add("Python");
		subjects_list.add("Data Structures");
		
		subj.setSubjects(subjects_list);
		return subj;
	}
	
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setName("Mahesh");
		std.setRollno(101);
		//std.setAddress(createAddrObj());	// manual DI
		//std.setSubjects(createSubObj());	// manual DI
		return std;
	}

}
