package in.code_practice;



public class All_inbuilt_methods {
	
	public static void main(String[] args) {
		
		String s="Shridhar";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			//System.out.println(Character.toLowerCase(s.charAt(i)));
			System.out.print(Character.toUpperCase(s.charAt(i)));
			System.out.println(s.substring(i));
			//System.out.println(s.substring(2,i));
			//char ch=0xBEEF;
			float f=0x1235;
			
			
		}
		
	//==========================================================================	
		String s1=s;
		if(s.matches(s1))
		{
			System.out.println("yes matching");
		}else
		{
			System.out.println("not matching");
		}
		
	//============================================================================
		
		if(s.startsWith("S") && s.endsWith("r"))
		{
			System.out.println("name matching proper");
		}else
		{
			System.out.println("not matching");
		}
		
	//============================================================================
		String s2="shridhar@gmail.com";
		if(s2.contains("@gmail.com"))
		{
			System.out.println("validated");
		}else
		{
			System.out.println("not validated");
		}
		
		
		//Or
		
		if(s2.matches("^[a-zA-Z.+-/%]+@gmail\\.com$"))
		{
			System.out.println("validated");
		}else
		{
			System.out.println("not validated");
		}
		
		
	//============================================================================
		
		if(s1.equals(s))
		{
			System.out.println("name is equal");
		}else
		{
			System.out.println("name not matching");
		}
		
	//============================================================================
		String s3="Shridhar";
		if(s.equalsIgnoreCase(s3))
		{
			System.out.println("case passed");
		}else
		{
			System.out.println("not passed");
		}
		
		
	//===========================================================================
		
		String a1="   ,i am shri";
		if(a1  !=null)
		{
			String s4=a1.trim();
			System.out.println(s4);
		}
		
	//===========================================================================
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			//using the char we can use the valueof method without valueof we cannot able to use replace
			System.out.println(String.valueOf(ch).replace('S', 's'));
			System.out.println(s.replace("r","R"));
		}
		
	//===========================================================================
		
		 String s5="Shri";
		 
		  System.out.println(s5);
		  s5=" ";
		 //char[]arr=s5.toCharArray();
		
			System.out.println(s5);
	
		
	//===========================================================================
		
		
		long time=System.currentTimeMillis();
		System.out.println(time);
		
		
	//math methods
	//===========================================================================
		
		int num=10;
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(-num));
		System.out.println(Math.pow(8, 2));
		System.out.println(Math.max(1,2));
		System.out.println(Math.min(10,8));
		System.out.println(Math.round(8.5));
		System.out.println(Math.ceil(8.1));
		System.out.println(Math.floor(8.1));
		
		double length=Math.random();
		if(length>=10)
		{
			System.out.println("length is equals to 10");
		}
		else
		{
			System.out.println("not 10");
		}
		
		
		
		long min = 1000000000000L;  
        long max = 9999999999000L;  

      
        long random10Digit = min + (long)(Math.random() * (max - min + 1));

        System.out.println("Random 10-digit number: " + random10Digit);
		
	}

}
