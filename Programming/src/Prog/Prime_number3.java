package Prog;

public class Prime_number3 {
	public static  int prime_num(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}	return count;
		

	}

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=1;;i++)
		{
			
			int num=i;
			int res=prime_num(num);
			if(res==2)
			{
				//printing the the 15 prime number 
				System.out.println("prime number : "+i);
				sum+=i;
				count++;
				
			}
			if(count==15)
			{
				//addition of the 15 prime numbers
				System.out.println("sum : "+sum);
				break;
			}
		}
		

	}

}
