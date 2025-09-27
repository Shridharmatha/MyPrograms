  package in.code_practice;

public class swapping_without_third_variable {
	
	public static void main(String[] args) {
		int a=45;
		int b=66;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
