package in.code_practice;

import java.util.Arrays;

public class selection_sort {
	public static void main(String[] args) {
		
	int [] arr= {1,6,4,5,2,3};
	
	for(int i=0;i<arr.length-1;i++)
	{
		int min_idx=i;
		for(int j=i+1;j<arr.length;j++)
		{
		
		if(arr[j]<arr[min_idx])
		{
		
			min_idx=j;
		}
		}
		
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		
	}
	System.out.println(Arrays.toString(arr));
	}
	

}
