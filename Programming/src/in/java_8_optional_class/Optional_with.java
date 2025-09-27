package in.java_8_optional_class;

import java.util.Optional;

public class Optional_with {
	
	public static String getmyname(Optional<Customer> customer)
	{
		return customer.map(Customer::getName).orElse("unknown data"); 
		
	}
	
	public static void main(String[] args) {
		Optional<Customer> c=Optional.empty();
		
		System.out.println(getmyname(c));
	}
	

}
