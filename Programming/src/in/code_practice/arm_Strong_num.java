package in.code_practice;

public class arm_Strong_num {
	
	public static int count_dig(int num)
	{
		int count=0;
		while(num !=0)
		{
			num=num/10;
			count++;
		}
		//System.out.println(count);
		return count;
	}
	
	public static int arm_strong(int num)
	{
		int res=0;
		int cout=count_dig(num);
		
		while(num !=0)
		{
			int rem=num%10;
			 res= (int) Math.pow(rem,cout)+res;
			 num=num/10;
		}
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		
		int num=153;
		int res=arm_strong(num);
		
		if(res==num)
		{
		System.out.println("armstrong num "+res);
		}else
		{
			System.out.println("not ");
		}
		
	}

}
