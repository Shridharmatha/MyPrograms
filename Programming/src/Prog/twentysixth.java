package Prog;

public class twentysixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=15;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==row||j==1||j==row||(i==j)||(i+j==row+1)||(i==(row/2)+1)||(j==(row+1)/2))//(i==2 ,j==2 and i==2,j==4 )
				{
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
