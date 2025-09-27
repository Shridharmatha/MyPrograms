package Prog;

public class Pebonaci_in_recursion {
	public static void pebonaci_num(int a,int b,int n)
	{
		int sum=0;
		if(n==0)
		{
			//System.out.println("addition of the fibonaci nums : "+sum);
			return ;
		}
		
			System.out.println(a);
			sum=sum+a;	
			//System.out.println("addition of the fibonaci nums : "+sum);
			pebonaci_num(b,a+b,n-1);
			System.out.print("");
			//System.out.println("addition of the fibonaci nums : "+sum);
			System.out.println(a);
			
			
	}
	

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		pebonaci_num(a,b,n);
		
		

	}

}
