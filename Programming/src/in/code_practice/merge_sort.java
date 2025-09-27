package in.code_practice;

import java.util.Arrays;

public class merge_sort {
	
	public static int[] merge(int []arr1,int[]arr2,int[]res)
	{
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length &&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				res[k]=arr1[i];
				i++;
				k++;
			} else if(arr1[i]>arr2[j])
			{
				res[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length)
		{
			res[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length)
		{
			res[k]=arr2[j];
			j++;
			k++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int []arr1= {1,5,7,9,11};
		int []arr2= {2,3,4,8,10};
		int []res=new int [arr1.length+arr2.length];
		int []res1=merge(arr1,arr2,res);
		System.out.println(Arrays.toString(res1));
		
	}

}
