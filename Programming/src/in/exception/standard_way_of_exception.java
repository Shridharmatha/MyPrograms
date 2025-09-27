package in.exception;

public class standard_way_of_exception {
	
	public static void main(String[] args) {
		int age=27;
		
		
		try
		{
			if(age>18 && age<30)
			{
				System.out.println("age is matched");
				
			}else
			{
				throw new AgeException();
			}
			
		}catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}

	}
}

class AgeException extends Exception
{
	public String getMessage()
	{
	
		return "age invalid";
	}
}
