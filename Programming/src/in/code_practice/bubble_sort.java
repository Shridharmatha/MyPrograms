package in.code_practice;

import java.util.Arrays;

public class bubble_sort {
	
	public static void main(String[] args) {
		int []arr= {10,40,30,70,20,80,90};
		//int []res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
					//res=arr;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(res));
	}

}
