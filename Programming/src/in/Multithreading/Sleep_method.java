package in.Multithreading;

public class Sleep_method extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("child method running");
			
			try
			{
				Thread.sleep(1000,45000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Sleep_method sm=new Sleep_method();
		sm.start();
		//sm.interrupt();
		
		
		
	}

	

}
