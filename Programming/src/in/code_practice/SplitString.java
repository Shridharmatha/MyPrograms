package in.code_practice;

import java.util.Arrays;

public class SplitString {
	public static void main(String[] args) {
		String s="hi i am shridhar";
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(arr[i].length()%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
