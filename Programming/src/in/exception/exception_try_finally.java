package in.exception;

public class exception_try_finally {
	
	public static void main(String[] args) {
		
		try {
		
		System.out.println("writing the java code in the try block");
		int res=5/0;
		}finally {
			System.out.println("finally block is always running ");
		}
	}

}
