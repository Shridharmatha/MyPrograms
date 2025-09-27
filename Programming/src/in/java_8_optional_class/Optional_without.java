package in.java_8_optional_class;

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Optional_without {
	
	public static String myname(Customer customer)
	{
		return customer.getName();
	}
	
	public static void main(String[] args) {
		
		Customer c=null;
		
		System.out.println(myname(c));
		
	}

}


