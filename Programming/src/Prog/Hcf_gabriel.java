package Prog;

public class Hcf_gabriel {
	public static int Hcf_gabriel(int a,int b)
	{
		while(a!=0 && b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}else
				b=b%a;
		}
		return (a!=0)?a:b;
	}

	public static void main(String[] args) {
		int a=24,b=18;
		int hcf=Hcf_gabriel(a,b);
		System.out.println(hcf);

	}

}
