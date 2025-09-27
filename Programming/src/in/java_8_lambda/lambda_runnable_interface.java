package in.java_8_lambda;

public class lambda_runnable_interface {
	
	public static void main(String[] args) {
		Runnable r=()->System.out.println("hi this is runnable intrface");
		new Thread(r).start();
	}

}
