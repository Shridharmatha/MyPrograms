package Prog;

public class twentyeighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++)
		{
			int k=i;
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==row||j==1||j==row)
				{
					System.out.print((char)(k+64)+" ");
					k++;
				}
				
				else {
					System.out.print(" "+" ");
					k++;
				}
			}
			System.out.println();
		}


	}

}
