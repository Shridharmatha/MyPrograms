package Prog;

public class Palindrome1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=111;
//		int temp=num;
//		int res=0;
//		while(num!=0)
//		{
//			int rem=num%10;
//			res=(res*10)+rem;
//			num=num/10;
//		}
//		System.out.println(temp);
//		System.out.println(res);
//		if(temp==res)
//		{
//			System.out.println("palindrome");
//		}else
//			System.out.println("it is not palindrome");
		
		
		public static int reverse(int num)
		{
			int res=0;
			while(num!=0)
			{
				int rem=num%10;
				res=(res*10)+rem;
				num=num/10;
			}
			return res;
		}
		public static void main(String[] args) {
			int count=0;
			int sum=0;
			for(int i=1;;i++)
			{
				int num=i;
				int rev=reverse(num);
				if(num==rev) {
					
					 sum=count+i;
					 count++;
					//System.out.println("the addition of the palindrome numbers : "+i);
					System.out.println("palindrome : "+i);
				}
				//else
//					System.out.println("not palindrome");
				if(count==15)
				{
					System.out.println("the addition of the palindrome numbers : "+sum);
					break;
				}
			}
			
			

	}

}
