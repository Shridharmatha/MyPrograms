package in.exception;

public class interupted_Exception {
	public static void main(String[] args) {
		
		try
		{
			int a,b,c;
			a=10;
			b=5;
			c=a/b;
			System.out.println(c);
			Thread.sleep(8000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
