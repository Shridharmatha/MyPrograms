package Prog;

public class twentyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int k=1;
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(count%2==0)
				{
					System.out.print((char)(k+64)+" ");
				}else {
					System.out.print((char)(k+64+32)+" ");
				}
				k++;
				count++;
			}
			System.out.println();
		}

	}

}
