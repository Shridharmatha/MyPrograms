package Prog;

public class string_print_owels {

	public static void main(String[] args) {
		String s="Pentagon space";
		int count=0;
		int count1=0;
		int count_s=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				//System.out.println(s.charAt(i));
				count++;
			}
			else if(ch==32){
				count_s++;
				
			}
			else
			{
				//System.out.println(s.charAt(i));
				count1++;
			}
			
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count_s);
		
		

	}

}
