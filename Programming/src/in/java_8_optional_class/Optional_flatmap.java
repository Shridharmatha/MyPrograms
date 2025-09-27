package in.java_8_optional_class;

import java.util.Optional;

class person
{
	private Optional<String> email;

	public person(String email) {
		
		this.email = Optional.ofNullable(email);
	}
	
	public Optional<String> getemail()
	{
		return email;
	}
	
}

public class Optional_flatmap {
	
	public static void main(String[] args) {
		
		person p=new person("Shridhar@gmail.com");
		Optional<person> opt=Optional.of(p);
		
		Optional<String> pt=opt.flatMap(person::getemail);
		
		System.out.println(pt.orElse("no mail provided"));
		
	}

}
