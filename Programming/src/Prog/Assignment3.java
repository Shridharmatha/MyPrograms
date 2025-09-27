package Prog;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int k=0;
//		int a=5;
//		for(int i=1;i<=a;i++){
//			k+=i;
//			for(int j=k;j>k-i;j--)
//			{
//				System.out.print(j+" ");
//				//k++;
//			}
//			System.out.println();
//		}
		int sum=0;
		int row=5;
		int k=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
			k=sum;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}

	}

}

