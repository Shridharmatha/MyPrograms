package com.practice;

import java.util.Arrays;

public class delete_index_array {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8};
		int []res=new int[arr.length-1];
		int idx=4;
		int ele=5;
		for(int i=0;i<idx;i++)
		{
			res[i]=arr[i];
			res[idx]=ele;
		}
		for(int j=idx+1;j<arr.length;j++)
		{
			res[j-1]=arr[j];
		}
		
		System.out.println(Arrays.toString(res));
	}

}
