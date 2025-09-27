package in.code_practice;

public class Stringcountingandprint {
	
	public static void main(String[] args) {
		String s="aaabbccddd";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}else
			{
				System.out.print(s.charAt(i));
				System.out.print(count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1));
		System.out.print(count);
	
	
	String s1="a3b2c2d3";
	for(int i=1;i<s1.length();i+=2)
	{
		for(int j=1;j<s1.charAt(i)-'0';j++)
		{
			System.out.println(s1.charAt(i-1));
		}
	}
	

}
}
