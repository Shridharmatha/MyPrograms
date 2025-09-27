package Prog;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		//int k=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=(a-i);j++)
			{
				System.out.print("-"+" ");
			}
			for(int j=a;j>=a-i+1;j--)
			{
				System.out.print(j+" ");
			}
			//k++;
			System.out.println();
	}

	}

}
