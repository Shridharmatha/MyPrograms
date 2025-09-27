package in.code_practice;

public class Substring {
	public static void main(String[] args) {
		
		
		String s="shridhar";
		//String res="";
		for(int i=0;i<s.length();i++)
		{
			String res="";
			
			for(int j=i;j<s.length();j++)
			{
			res=res+s.charAt(j);
			System.out.println(res);
			}
		}
		
		
	}

}
