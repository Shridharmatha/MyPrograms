package in.Multithreading;

public class Runnable_interface implements Runnable{

	@Override
	public void run() {
	System.out.println("calls the run method");
		
	}
	
	public static void main(String[] args) {
		
		Runnable_interface rt=new Runnable_interface();
		
		Thread t=new Thread(rt);
		
		t.start();
		System.out.println("calls the main method");
	}

}
