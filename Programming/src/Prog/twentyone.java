package Prog;

public class twentyone {


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
			int row=8;
			int k=1;
			for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=i;j++)
				{
					while(true)
					{
						if(k==reverse(k))
						{
							System.out.print(k+" ");
							k++;
							break;
						}
						k++;
					}
				}
				System.out.println();
				
					
				}
				
			}
	
}

	
