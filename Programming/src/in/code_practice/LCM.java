 package in.code_practice;

public class LCM {
	public static void main(String[] args) {
		
		int a=12;
		int b=6;
		int lcm=1;
		int sum=(a>b)? a:b;
		for(int i=sum;i<=(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}
	

}
