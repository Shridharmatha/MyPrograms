package in.code_practice;

public class Equal_Ignore_Case {
	
	public static void main(String[] args) {
		
		//checking given value is matching or not
		String name="Shridhara";
		boolean n=name.equalsIgnoreCase("ShridharA");
		System.out.println(n);
		
		//compare to strings
		
		String s1="hello";
		String s2="HEllO";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("matching");
		}else
		{
			System.out.println("not matching");
		}
		
		//Case-insensitive Command Matching
		
		String s="SHRIDHA";
		  switch (s.toLowerCase()) {
          case "shridhar":
              System.out.println("Matched: shridhar");
              break;

          case "john":
              System.out.println("Matched: john");
              break;

          default:
              System.out.println("No match found.");
      }
		
		//Compare Characters (Converted to Strings)
		
		char c='S';
		if(String.valueOf(c).equalsIgnoreCase("s"))
		{
			System.out.println("ya it is matching");
		}
		
		//In Filtering or Searching Logic (Ignore Case)
		String [] arr= {"shri","ammu","soumya"};
		for(String names:arr)
		{
			if(names.equalsIgnoreCase("AMMU"))
			{
				System.out.println("yaa it also matching");
			}
		}
	}

}
