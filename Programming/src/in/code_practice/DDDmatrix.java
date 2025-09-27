package in.code_practice;


public class DDDmatrix {
	
	public static void main(String[] args) {
		
		int[][][] num= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				for(int k=0;k<num[i][j].length;k++) {
				System.out.print(num[i][j][k]+" ");
			}
			System.out.println();
		}
		}
		
		
		
		
		
	}

}
