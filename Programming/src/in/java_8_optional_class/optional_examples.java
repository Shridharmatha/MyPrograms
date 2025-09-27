package in.java_8_optional_class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional_examples {
	
	String user="ADMIN";
	
	public static Optional<String> getEamil(String user)
	  {
		  if(user.equals("ADMIN"))return Optional.of("Shridhar@gmail.com");
		  return Optional.empty();
		  
	  }
	
	public static void main(String[] args) {
		
		optional_examples op=new optional_examples();
		
		//using optional.of() methods  without null
		
		Optional<String>  opt=Optional.of("Shridhar,ammu");
		System.out.println(opt.get());
		
	//	using optional.of() methods  with null  -> throw null pointer exception
//		Optional<String>  opt1=Optional.of(null);
//		System.out.println(opt1.isPresent());
		
		//b) Optional.ofNullable(value) – Allows both null and non-null values 
		
		Optional<String> opt2=Optional.ofNullable("hi i am shridhar");
		System.out.println(opt2.get());
		
		Optional<String> opt22=Optional.ofNullable(null);
		System.out.println(opt22.isPresent());
		System.out.println(opt22.isEmpty());
		
		//Avoid using get() directly, as it throws NoSuchElementException if Optional is empty. 
		
//		Optional<String> emptyOptional = Optional.empty(); 
//		System.out.println(emptyOptional.get()); // Throws NoSuchElementException
		
		// orElse(defaultValue) – Returns the value or a default
		
		Optional<String> optt=Optional.empty();
		System.out.println(optt.orElse("default value"));
		
		// orElseGet(Supplier) – Returns the value or calls a supplier function
		
		Optional<String> opttt=Optional.empty();
		System.out.println(opttt.orElseGet(()->"this is empty area"));
		
		//orElseThrow(Supplier) – Throws an exception if no value is present
//		Optional<String> oppt = Optional.empty();
//		String s=oppt.orElseThrow(() -> new RuntimeException("value is missing"));
//		System.out.println(s);
		
		
		
		//Transforming Optional Values
		
		// map(Function) – Transforms the value if present
		
		Optional<String> oop=Optional.of("Helllo Hi");
		Optional<String> upper=oop.map(String::toUpperCase);
		System.out.println(upper.orElse("no value"));
		
		// Filter Optional Value
		
		Optional<String> oo=Optional.of("Shridhar");
		oo.filter(s->s.startsWith("S"))
		.ifPresent(System.out::println);
		
		//Chaining Optional Methods
		
		Optional<String> o1=Optional.of("Shridhar");
		String s=o1.filter(n->n.length()>=8).map(String::toUpperCase).orElse("default value");
		System.out.println(s);
		
		Optional<String> email=getEamil("");
		System.out.println(email.orElse("this mail id is not about admin"));
		
		//optional with stream API
		
		List<String> s1=Arrays.asList("shri","anu","sammu");
		Optional<String> ipln=s1.stream().filter(n->n.startsWith("S")).findFirst();
		System.out.println(ipln.orElse("data not present"));
		
		//or
		
		ipln.ifPresent(System.out::println);
		
	
		
	  

		
		

		
	}

}
