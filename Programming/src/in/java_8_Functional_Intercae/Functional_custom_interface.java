package in.java_8_Functional_Intercae;

interface calculator
{
	int calculate(int a,int b);
	
}



public class Functional_custom_interface {
	
	//passing lambda to a method

	public static void operate(int a,int b,calculator c)
	{
		System.out.println(c.calculate(a, b));
		
	}
	public static void main(String[] args) {
		calculator c=(a,b)->a+b;
	     System.out.println(c.calculate(10,20));
	     
	     operate(5,4,(a,b)->a-b);
	     
	    
	     
	     
	}

}
