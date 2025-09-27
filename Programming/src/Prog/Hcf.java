package Prog;

public class Hcf {
	//use brute force methode
	public static int hcf_factor(int a,int b)
	{
		int smlt=(a<b)?a:b;
		int cf=0;
		for(int i=1;i<=smlt;i++)
		if(a%i==0 && b%i==0)
		{
			cf=i;
		}
		return cf;
		
		
	}

	
	public static void main(String[] args) {
		int a=24,b=18;
		int hcf=hcf_factor(a,b);
		
		
		System.out.println(hcf);
		
		
		

	
	
		
		
	}




}
