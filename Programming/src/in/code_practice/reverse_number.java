package in.code_practice;

public class reverse_number {
	public static int rev(int num)
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
	
	public static void rev_rec(int num,int res,int rem)
	{
		if(num==0)
		{
			
			System.out.println(res);
			return;
		}
		rem=num%10;
		res=(res*10)+rem;
		//rev_rec(num/10,(res*10)+rem,num%10);
		rev_rec(num/10,res,rem);
	}
	
	public static void main(String[] args) {
		
		int num=1234;
		int res=rev(num);
		rev_rec(num,0,0);
		System.out.println(res);
	}

}
