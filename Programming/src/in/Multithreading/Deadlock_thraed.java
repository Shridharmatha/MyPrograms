package in.Multithreading;

public class Deadlock_thraed extends Thread{
	
	public static Thread td;
	
	@Override
	public void run() {
		
		try
		{
			td.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread is running");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		td=Thread.currentThread();
		
		Deadlock_thraed dt=new Deadlock_thraed();
		
		
		dt.start();
		dt.join();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread is running");
		}
		
	}

	

}
