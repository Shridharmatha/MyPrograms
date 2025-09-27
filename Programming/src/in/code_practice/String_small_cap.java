package in.code_practice;

public class String_small_cap {
	public static void main(String[] args) {
		String s="ShriDHAR";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.print(Character.toLowerCase(ch)+" ");
			if(ch>=90 &&ch<=122 )
			{
				ch=(char)(ch-32);
				res=res+ch;
			}else
			{
				res=res+ch;
			}
		}
		System.out.println(res);
		
	}
	
	

}
