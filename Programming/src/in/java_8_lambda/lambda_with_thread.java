package in.java_8_lambda;

public class lambda_with_thread {
	
	public static void main(String[] args) {
		
		Runnable r=() -> {
			for(int i=0;i<=5;i++)
			{
				System.out.println("hi i am shridhar");
			}
			
		
	};
	
	Thread t=new Thread(r);
	t.start();
	}

}
