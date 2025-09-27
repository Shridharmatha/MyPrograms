package in.exception;

public class manual_throwing_exception {
	
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		try
		{
			if(a>b)
			{
				c=a-b;
			}else 
			{
				throw new Exception();
			}
		}catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("a is less then b");
		}
	}

}
