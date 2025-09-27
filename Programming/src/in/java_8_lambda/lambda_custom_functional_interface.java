package in.java_8_lambda;

interface inter
{
	String sayhello(String name);
	
}

public class lambda_custom_functional_interface {
	
	public static void main(String[] args) {
		
		 inter intt=name -> " is my name "+name;
		 System.out.println(intt.sayhello("shri"));
		
	}

}
