package in.code_practice;

import java.util.Arrays;

public class reverse_array {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		int []res=new int[arr.length];
		//int k=0;
		for(int i=arr.length-1,j=0;i>=0;i--,j++)
		{
			res[j]=arr[i];
			//k++;
			
		}
		System.out.println(Arrays.toString(res));
	}

}
