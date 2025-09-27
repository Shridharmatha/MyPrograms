package Prog;

public class fifteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
			System.out.print(" "+" ");
		}
		for(int j=row;j>=row-i+1;j--)
		{
			System.out.print(j+" ");
		}
		for(int j=row-i+2;j<=row;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		

	}


	}

}
