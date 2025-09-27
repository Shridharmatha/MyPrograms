package in.java_8_Default_static_methods;

public interface MyInterface {
	
	//default methods have implementation in interface
	
	public default void math()
	{
		System.out.println("hi ");
		m1();
		m2();
		
	}
	
	//static methods have implementation in interface
	static void mymath()
	{
		System.out.println("hello");
		m2();
		//in static we can call only static methods not others
       
	}
	
	//public methods not have implementation in interface
	public void m();
	
	//private methods have implementation in interface  ->  The method m1() from the type MyInterface is never used locally
	private void m1()
	{
		System.out.println("hi i am private method");
	}
	
	private static void m2()
	{
		System.out.println("hi i am private static");
	}
	
}

class myclass implements MyInterface
{

	@Override
	public void m() {

      System.out.println("hi i am public methods from the interface implemented by myclass");
		
	}
	
	@Override
	public void math()
	{
		System.out.println("i am default method from myinterface override in the my class without the default access modifier");
	}
	
	
	
	
}

class tes
{
	public static void main(String[] args) {
		
		MyInterface.mymath();
		myclass my=new myclass();
		my.m();
		my.math();
	}
}


