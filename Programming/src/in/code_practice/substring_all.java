package in.code_practice;

public class substring_all {
	public static void main(String[] args) {
		
		String s="hello";
		for(int i=0;i<s.length();i++)
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				char ch=s.charAt(j);
				res=res+ch;
				System.out.println(res);
				
			}
		}
	}

}
