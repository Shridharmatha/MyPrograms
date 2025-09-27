     package in.code_practice;

public class substring_palindrome {
	
	public static String rev(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res=s.charAt(i)+res;
		}
		//System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		String s="abadbd";
		
		for(int i=0;i<s.length();i++)
		{
			String res1="";
			for(int j=i;j<s.length();j++)
			{
				res1=res1+s.charAt(j);
			
			String revs=rev(res1);
			//System.out.println(revs);
			if(res1.equals(revs) && res1.length()>1)
			{
				System.out.println(res1+"                            "+revs);
			}
		}
		}
		
		
		
	}

}
