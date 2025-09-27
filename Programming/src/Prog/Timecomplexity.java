package Prog;

public class Timecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method 1
		int num=24;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
		
		//method 2
		
		int n=25;
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(n);
		
		
		
		
		//method 3
		int a=25;
		for(int i=1;i<=(int)Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
				//System.out.println(a/i);
			}
			}
		//System.out.println(a);
			for(int i=(int)Math.sqrt(a);i>=1;i--)
			{
				if(a%i==0 && i!=(a/i))
				{
					//System.out.println(i);
					System.out.println(a/i);
				
		}
		

	}

}
	
}
