package in.java_8_Default_static_methods;

interface AA
{
    static void log()
   {
	   System.out.println("i am a");
   }
}

interface BB
{
	 static void log()
	{
		System.out.println("i am b");
	}
	 
	 default void logs()
	 {
		 System.out.println("i am default method from the interface b");
		 
	 }
}

class cc implements AA,BB
{

	public void log() {
		// TODO Auto-generated method stub
		System.out.println("i am represent by c class");
	}
	
	//@Override
//	public void logs()
//	{
//		 System.out.println("i am default method override from the interface b");
//	}
	
}

public class conflict_same_publi_methods {
	
	public static void main(String[] args) {
		
		cc c1=new cc();
		c1.logs();
		c1.log();
		BB.log();
		AA.log();
		
	}

}
