package Prog;

public class twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(row-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=5;j>=row-i+1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			for(int j=row-i+2;j<=5;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=(row-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=5;j>=row-i+1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			for(int j=row-i+2;j<=5;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
