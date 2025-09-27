package Prog;

public class Least_common_multiplication {
	public static int lcf_multiplication(int a,int b)
	{
		int max=(a>b)?a:b;
		int lcm=1;
		for(int i=max;i<=(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				lcm=i;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
	int a=3,b=5;
	int lcf=lcf_multiplication(a,b);
	System.out.println(lcf);

	}

}
