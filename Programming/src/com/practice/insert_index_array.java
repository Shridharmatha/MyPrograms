package com.practice;

import java.util.Arrays;

public class insert_index_array {
	
	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,7,8};
		int idx=3;
		int ele=4;
		int []res=new int[arr.length+1];
		
		for(int i=0;i<idx;i++)
		{
			res[i]=arr[i];
			res[idx]=ele;
			
		}
		for(int j=idx;j<arr.length;j++)
		{
			res[j+1]=arr[j];
		}
		System.out.println(Arrays.toString(res));
	}

}
