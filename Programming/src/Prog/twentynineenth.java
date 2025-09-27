package Prog;

public class twentynineenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=6;
		int cols=7;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8))
				{
					System.out.print("+"+" ");
				}
				else if(i==2 && j==2) {
					System.out.print("S"+" ");
				}
				else if(i==2 && j==3) {
					System.out.print("H"+" ");
				}
				else if(i==2 && j==4) {
					System.out.print("R"+ "");
				}
				else if(i==3 && j==3) {
					System.out.print("I"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for(int i=row-1;i>=0;i--)
		{
			for(int j=0;j<cols;j++)
			{
				if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8))
				{
					System.out.print("+"+" ");
				}
				else if(i==2 && j==2) {
					System.out.print("D"+" ");
				}
				else if(i==2 && j==3) {
					System.out.print("H"+" ");
				}
				else if(i==2 && j==4) {
					System.out.print("A"+" ");
				}
				else if(i==3 && j==3) {
					System.out.print("R"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		

	}

}
