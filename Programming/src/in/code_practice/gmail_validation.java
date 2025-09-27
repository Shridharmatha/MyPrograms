package in.code_practice;

public class gmail_validation {
	
	public static void main(String[] args) {
		String in="shridhar@gmail.com";
		
//		if(in.startsWith("[A_Z^a_z]"))
//		{
//			System.out.println("done");
//		}
		
		//i can make this in three ways 
		
		// if(in.contains("@gmail.com"))
		// if(in.endsWith("@gmail.com"))
		if(in.matches("^[a-zA-Z./%+-]+@gmail\\.com$"))
		{
			System.out.println("the email validation is done " +in);
		}else
		{
			System.out.println("failed the email validation");
		}
	}

}
