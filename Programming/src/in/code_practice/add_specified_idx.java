package in.code_practice;

import java.util.Arrays;

public class add_specified_idx {
	
	public static void main(String[] args) {
		
		//for add the element in specified index
		
		int [] arr= {10,20,30,40,50,60,70};
		int ele=35;
		int idx=3;
		int []res=new int[arr.length+1];
		
		for(int i=0;i<idx;i++)
		{
			res[i]=arr[i];
		}
		res[idx]=ele;
		
		for(int j=idx;j<arr.length;j++)
		{
			res[j+1]=arr[j];
		}
		
		System.out.println(Arrays.toString(res));
		
		
		//for remove the element in specified index
		
		int [] arr1= res;
		
		
		int []res1=new int[arr1.length-1];
		
		for(int i=0;i<idx;i++)
		{
			res1[i]=arr1[i];
		}
		
		
		for(int j=idx+1;j<arr1.length;j++)
		{
			res1[j-1]=arr1[j];
		}
		
		System.out.println(Arrays.toString(res1));
		
	}

}
