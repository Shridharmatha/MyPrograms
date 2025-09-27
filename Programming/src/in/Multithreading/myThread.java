package in.Multithreading;

public class myThread extends Thread{
	
		public void run()
		{
			
			System.out.println("child thread is running");
			
		}
	
	
	public static void main(String[] args) {
		
		myThread m1=new myThread();
		
		//m1.start();
		m1.run();
		
		System.out.println("main thred is running");
		
	}

}
