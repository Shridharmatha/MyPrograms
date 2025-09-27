package Prog;

public class Hcf_euclide {
	public static int hcf_euclide(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}


	public static void main(String[] args) {
		int a=100,b=1;
		
		int hcf1=hcf_euclide(a,b);
		
		
		System.out.println(hcf1);

	}

}
