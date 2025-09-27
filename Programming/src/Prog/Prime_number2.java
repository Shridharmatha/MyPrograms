package Prog;


public class Prime_number2 {
	public static int check_fact(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				//System.out.println();
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		for(int i=1;;i++) {
			int num=i;
			int res=check_fact(num);
			if(res==2)
			{
				sum+=i;
				count++;
				System.out.println("its is prime : "+i);
				
			}
//			else
//				System.out.println("it is not prime");
			if(count==15)
			{
				System.out.println("the addition of the prime number : "+sum);
				break;
			}

		}
		}
}
