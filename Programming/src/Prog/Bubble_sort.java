package Prog;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,100,90,84,24,65,16};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
