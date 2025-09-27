package Prog;

public class reverse_string {

	public static void main(String[] args) {
		String s="madam";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			res=ch+res;
		}
		System.out.println(res);
		if(s.equals(res))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		

	}

}
