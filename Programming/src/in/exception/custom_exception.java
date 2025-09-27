package in.exception;

public class custom_exception {
	
	public static void main(String[] args) throws AlessthenBException {
		int a,b,c;
		a=10;
		b=20;
		try
		{
			if(a>b)
			{
				c=a-b;
				System.out.println(c);
			}else
			{
				throw new AlessthenBException();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


class AlessthenBException extends Exception
{
	public AlessthenBException()
	{
		System.out.println("a less then b exception");
	}
	

}
