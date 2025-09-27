package Prog;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int k=1;
		int sum=0;
		  for(int i=1;i<=row;i++)
	        {
			  sum+=i;
			  k=sum;
	            for(int j=1;j<=i;j++)
	            {
	        
	        System.out.print(k+" ");
	          k--;
	            }
	
	            System.out.println();
	        }
		  int rows=5;
			int k1=1;
			  for(int i=1;i<=rows;i++)
		        {
		            for(int j=1;j<=i;j++)
		            {
		        
		        System.out.print(k1+" ");
		        k1++;
		            }
		
		            System.out.println();
		        }

	}

}
