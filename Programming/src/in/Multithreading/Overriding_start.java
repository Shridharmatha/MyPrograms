package in.Multithreading;

public class Overriding_start extends Thread{
	
	@Override
	public void start()
	{
		System.out.println("child method call");
	}
	
	public static void main(String[] args) {
		
		Overriding_start th=new Overriding_start();
		
		th.run();
		System.out.println("main method call");
		
	}

}
