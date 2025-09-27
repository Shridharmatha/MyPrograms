package in.exception;

public class demo {
	
	public static void main(String[] args) {
		
		
		try
		{
			int [] arr=new int[99999];
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println("arays index out of bound");
		}
		System.out.println("main method executed correctly");
	}

}
