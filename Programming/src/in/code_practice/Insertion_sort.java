package in.code_practice;

import java.util.Arrays;

public class Insertion_sort {
	
	public static void inser(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int []arr= {1,5,2,9,3,7,10,12,13};
		inser(arr);
	}

}
