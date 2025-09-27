package Prog;

public class Happy_number {
	public static int happy(int num)
	{
		int res=0;
   	 while(num!=0)
   	 {
   		 int rem=num%10;
   		res=(rem*rem)+res;
   		num=num/10;
   		
   	 }
   	 return res;
	}

	public static void main(String[] args) {
		int happycount=0;
		for(int i=1;i<=1000;i++)
		{
			
			int num=i;
			int res=happy(num);
			while(res!=1 && res!=4)
			{
				res=happy(res);
			}
			
			if(res==1)
			{
				happycount++;
			System.out.println(" happy number : "+num);	
		}
			
		
	}
		System.out.println("the total number of the output : "+happycount);
	}

}
