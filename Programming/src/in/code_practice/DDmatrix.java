package in.code_practice;


public class DDmatrix {
	
	public static void main(String[] args) {
		
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}

//int [][]arr= {{1,1,3},{4,5,6},{7,8,9}};
//
//for(int i=0;i<arr.length;i++)
//{
//	for(int j=0;j<arr[i].length;j++)
//	{
//		System.out.print(arr[i][j]+" ");
//	}
//	System.out.println();
//}
