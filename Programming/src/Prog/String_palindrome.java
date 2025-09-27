package Prog;

public class String_palindrome {
	public static String reverse(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res=s.charAt(i)+res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		for(int i=0;i<s.length();i++)
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				res=res+s.charAt(j);
//				System.out.println(res);
				//System.out.println(s.substring(i,j+1));
				String rev=reverse(res);
				if(res.equals(rev))
				{
					System.out.println(res);
				}
//				else
//					System.out.println();
				
			}
		}

	}

}
