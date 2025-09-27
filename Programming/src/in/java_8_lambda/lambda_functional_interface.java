package in.java_8_lambda;


interface myinter
{
	void start();
	
}
public class lambda_functional_interface {
	
	public static void main(String[] args) {
		myinter my=() -> System.out.println("hi i am shri");
		my.start();
	}
	
	
	

}
