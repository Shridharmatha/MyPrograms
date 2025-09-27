package Prog;

public class Interview_question {
         public static int digit_sum(int num)
         {
        	 int sum=0;
        	 while(num!=0)
        	 {
        		 int rem=num%10;
        		 sum+=rem;
        		 num/=10;
        	 }
        	 return sum;
         }
	

	public static void main(String[] args) {
		int num=99;
		for(int i=num+1; ;i++)
		{
			if(digit_sum(num)*2==digit_sum(i))
			{
				System.out.println(i);
				break;
			}
		}
		
		

	}

}
