package in.code_practice;

public class KrishnaMurthy_num {
	
	public static int fact(int num)
	{
		int sum=1;
		for(int i=1;i<=num;i++)
		{
			sum*=i;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num=145;
		int temp=num;
		int sum1=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			sum1+=fact(rem);
			temp/=10;
//			System.out.println(sum);
		}		
		
		if(num==sum1)
		{
		System.out.println(" it a factorila num :"+sum1);
		}else
		{
			System.out.println("it not fact");
		}
	}

}
