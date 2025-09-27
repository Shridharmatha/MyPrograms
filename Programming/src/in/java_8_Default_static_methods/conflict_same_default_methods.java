package in.java_8_Default_static_methods;

interface A
{
   default void log()
   {
	   System.out.println("i am a");
   }
}

interface B
{
	default void log()
	{
		System.out.println("i am b");
	}
}

class c implements A,B
{

	@Override
	public void log() {
		
		// i am calling methods from the both interfaces
		
		A.super.log();// or B.super.log()
		B.super.log();
		
	}
	
}

public class conflict_same_default_methods {
	
	public static void main(String[] args) {
		c c1=new c();
		c1.log();
	}

}
