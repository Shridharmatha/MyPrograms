package in.java_8_lambda;


interface inte
{
	int start(int a,int b);
}
public class lambda_functionalinterface_parameter {
	
	
	public static void main(String[] args) {
		
		inte my=(a,b)->(a+b);
		System.out.println("sum :"+my.start(10, 20));
		
	}

}
