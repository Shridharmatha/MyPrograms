package in.code_practice;

public class halftraingle {
	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<(row-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=i-3+i;j>1;j--)
			{
				System.out.print("*"+" ");
				
//				if((i==3 && j==4)||(i==4 &&j==4))
//				{
//					System.out.println(" "+" ");
//				}
			}
			System.out.println();
		}
	}

}
