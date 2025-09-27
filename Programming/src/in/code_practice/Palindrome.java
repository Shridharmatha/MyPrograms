package in.code_practice;

public class Palindrome {
	
	public static int palin(int num)
	{
		int res=0;
		while(num !=0)
		{
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=0;i<1000;i++)
		{
		
		int num=i;
		int res1=palin(num);
		if(num==res1)
		{
			
			System.out.println("palindrome :"+num);
			count++;
			
		}
		sum+=num;
		}
		
		System.out.println("total sum of palindrome "+sum +",  total count of palindrome num :"+count);
//		}else
//		{
//			System.out.println("not palindrome");
//		}
		
		
	}

}
