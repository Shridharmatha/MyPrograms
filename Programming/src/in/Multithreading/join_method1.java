package in.Multithreading;

public class join_method1 implements Runnable{
	
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
		
		
		
		join_method jm=new join_method();
		
		Thread t=new Thread(jm);
		
		
		t.start();
		t.join();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("main method is running");
			Thread.sleep(500);
		}
		
	}

	
}
