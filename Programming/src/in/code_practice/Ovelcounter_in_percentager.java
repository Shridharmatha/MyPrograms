package in.code_practice;

public class Ovelcounter_in_percentager {
	
	public static void main(String[] args) {
		String s="Shridhar";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				//count=(count*100)/s.length();
			}
		}
		
		int percentage=(count*100)/s.length();
		System.out.println(percentage+" %");
	}

}
