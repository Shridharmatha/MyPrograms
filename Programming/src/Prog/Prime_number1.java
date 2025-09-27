package Prog;

public class Prime_number1 {
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
		int num=17;
		int res=check_fact(num);
		if(res==2)
		{
			System.out.println("its is prime");
		}
		else
			System.out.println("it is not prime");

	}

}
