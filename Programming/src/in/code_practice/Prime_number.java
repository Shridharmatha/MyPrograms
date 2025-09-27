package in.code_practice;

public class Prime_number {
	public static int prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			count++;
			}
		}
		//System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		int num=7;
		int res=prime(num);
		if(res==2)
		{
			System.out.println("it prime");
		}else
		{
			System.out.println("its not prime");
		}
		
		
	}

}
