package Prog;

public class Armstrong_in_recursion {
	public static int find_digit_recursion(int num,int digit)
	{
		if(num==0)
		{
			return digit;
		}
		return find_digit_recursion(num/10,digit+=1);
			
	}
	public static int rec_arm(int num,int res,int digit)
	{
		if(num==0)
		{
			return res;
		}
		return rec_arm(num/10,(int)Math.pow(num%10,digit)+res,digit);
	}

	public static void main(String[] args) {
		int res=0;
		int num=153;
		int digit=find_digit_recursion(num,0);
		int res1=rec_arm(num,res,digit);
		if(res1==num)
		{
			System.out.println("arm");
		}
		else
			System.out.println("not");
		

	}

}
