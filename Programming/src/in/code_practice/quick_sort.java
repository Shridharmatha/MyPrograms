package in.code_practice;

import java.util.Arrays;

public class quick_sort {
	
	public static void quicksort(int []arr,int begin,int end)
	{
		if(begin<end)
		{
			int part=partition(arr,begin,end);
			
			quicksort(arr, begin, part-1);
			
			quicksort(arr, part+1, end);
			
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int []arr,int begin,int end)
	{
		int pivot=arr[end];
		
		int i=(begin-1);
		
		for(int j=begin;j<end;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
		
		return i+1;
	}
	
	public static void swap(int []arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
	
	public static void main(String[] args) {
		int []arr= {4,9,2,5,7,1,6,8,3};
		quicksort(arr, 0, arr.length-1);
	}

}
