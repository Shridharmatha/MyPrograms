package in.Multithreading;

public class yield_method extends Thread{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child method is running");
		}
		Thread.yield();
	}
	
	public static void main(String[] args) {
		yield_method ym=new yield_method();
		
		ym.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("main method is running");
		}
		
	}

}
