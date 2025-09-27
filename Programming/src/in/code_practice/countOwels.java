package in.code_practice;

public class countOwels {
	public static void main(String[] args) {
		String name="Shridhar mA";
		int count=0;
		int count_s=0;
		int count_ow=0;
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			 
			char low=Character.toLowerCase(c);
			if(low=='a'||low=='e'|low=='i'||low=='o'||low=='u')
			{
				count_ow++;
				System.out.print(c);
				
			}
			else if(count_s==32)
			{
				count_s++;
			}
			
			
			else
			{
				//System.out.println(c);
				count++;
			}
		}
		System.out.println(count_ow);
		System.out.println(count);
		System.out.println(count_s);
	}

}
