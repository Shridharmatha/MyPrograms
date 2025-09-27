package in.Multithreading;

public class join_method extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread is running");
			
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t=Thread.currentThread();
		
		join_method jm=new join_method();
		
		
		jm.start();
		
		//there are three overloaded Varients of join method
		//jm.join();
		//jm.join(2000);
		jm.join(2000,2050);
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("main method is running");
			Thread.sleep(500);
		}
		
	}

	
}
