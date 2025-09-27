package in.code_practice;

public class happy_numm {
	
	public static int happy_num(int num)
	{
		int res=0;
		while(num !=0)
		{
			int rem=num%10;
			res=(rem*rem)+res;
			num/=10;
		}
		//System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		
		int num=28;
		int res=happy_num(num);
		while(res !=1 && res!=4)
		{
			
			res=happy_num(res);
			
		}
		if(res==1)
		{
			
			System.out.println("happy num :"+res);
		}else
		{
			System.out.println("not happy num :"+res);
		}
		
		
	}

}
