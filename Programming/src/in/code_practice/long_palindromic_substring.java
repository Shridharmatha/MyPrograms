package in.code_practice;

public class long_palindromic_substring {
	
	public static String reverse(String name)
	{
		String res="";
		for(int i=0;i<=name.length()-1;i++)
		{
			res=name.charAt(i)+res;
		}
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		
		String name="malayalam";
		
		int string_length=0;
		String long_string="";
		for(int i=0;i<=name.length();i++)
		{
			String res="";
			for(int j=i;j<=name.length()-1;j++)
			{
				res=res+name.charAt(j);
				String res1=reverse(name);
			//	System.out.println(res);
				if(res1.equals(name) && res1.length()>1)
				{
					if(name.length()>string_length)
					{
						string_length=res.length();
						long_string=res;
						
					}
					System.out.println(string_length+" "+long_string);
					System.out.println(res1);
				}
			}
			
		}
//		
//		System.out.println(res);
		
	}

}
