package Prog;

import java.util.*;

public class Array_forw_rev {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60};
		int []res=new int [arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			res[k]=arr[i];
			k++;
		}
		System.out.println(Arrays.toString(res));

	}

}
