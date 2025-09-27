package Prog;

public class String_longest_length {
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
		String s="malayalamdgfhngff";
		String lon_str="";
		int lon_len=0;
		for(int i=0;i<s.length();i++)
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				res=res+s.charAt(j);
				String rev=reverse(res);
				if(res.equals(rev))
				{
					if(rev.length()>lon_len)
					{
						lon_str=rev;
						lon_len=rev.length();
					}
					
				}
				
			}
		}
		System.out.println(lon_str);
		

	}

}
