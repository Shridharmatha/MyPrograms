package in.code_practice;

public class remove_space {
	
	public static void main(String[] args) {
		String s=" Shridhar";
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.print(String.valueOf(ch).replace(" ", ""));
		}
	}

}
