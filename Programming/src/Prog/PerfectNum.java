package Prog;

public class PerfectNum {
	public static int perfectnum(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=100;
		for(int i=1;i<=10000;i++)
		{
			int num=i;
			int res=perfectnum(num);
			if(num==res)
			{
				System.out.println("it is perfect number : "+res);
			}
//			else
//				System.out.println("it is not perfect number : "+res);
		}
		
			
		}
		
		

	}


