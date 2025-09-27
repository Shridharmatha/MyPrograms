package Prog;

public class twentyth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(row-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(i-1);j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=row-i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
