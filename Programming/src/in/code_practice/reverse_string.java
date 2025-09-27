package in.code_practice;

public class reverse_string {
	public static void main(String[] args) {
		String name="Shridhar";
		String res=""; 
		for(int i=name.length()-1;i>0;i--)
		{
			res=res+name.charAt(i);
			//System.out.println(res);
		}
		System.out.println(res);
	}

}
