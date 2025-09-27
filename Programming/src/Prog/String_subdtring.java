package Prog;

public class String_subdtring {

	public static void main(String[] args) {
		String s="Hello";
		for(int i=0;i<s.length();i++)
		{
			//String res="";
			for(int j=i;j<s.length();j++)
			{
//				res=res+s.charAt(j);
//				System.out.println(res);
				System.out.println(s.substring(i,j+1));
				
			}
		}

	}

}
