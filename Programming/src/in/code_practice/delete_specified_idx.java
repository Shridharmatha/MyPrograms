package in.code_practice;

import java.util.Arrays;

public class delete_specified_idx {	
		public static void main(String[] args) {
			int [] arr= {10,20,30,35,40,50,60,70};
		
			int idx=3;
			int []res=new int[arr.length-1];
			
			for(int i=0;i<idx;i++)
			{
				res[i]=arr[i];
			}
			
			
			for(int j=idx+1;j<arr.length;j++)
			{
				res[j-1]=arr[j];
			}
			
			System.out.println(Arrays.toString(res));
			
		}

	


}
