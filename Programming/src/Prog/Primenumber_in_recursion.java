package Prog;

public class Primenumber_in_recursion {
	public static int prime_num(int num,int n)
	{
		
		if(num==0)
			
		{
			//num++;
			return 0;
		}
		return prime_num(num%n,num++);
		
	}

	public static void main(String[] args) {
		
		int num=7;
		int res1=0;
		int num1=0;
		int res=prime_num(num,0);
		for(int i=1;i<=num;i++)
		{
			 num1=i;
		}
		if(num==2)
		{
			System.out.println("prime num");
		}
		

	}

}
