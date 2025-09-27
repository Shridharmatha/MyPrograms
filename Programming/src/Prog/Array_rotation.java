package Prog;

import java.util.Arrays;

public class Array_rotation {
	
	//Anticlock wise
	public static void rotate_arr(int []arr)
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
	    int [] arr= {10,20,30,40,50,60};
	    for(int i=0;i<=3606%arr.length;i++)
	    {
	    	rotate_arr(arr);
	    }
	    System.out.println(Arrays.toString(arr));

	}
	
	//clockwise direction
	public static void rotate_arr1(int []arr)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}

//	public static void main(String[] args) {
//	    int [] arr= {10,20,30,40,50,60};
//	    for(int i=0;i<=3606%arr.length;i++)
//	    {
//	    	rotate_arr1(arr);
//	    }
//	    System.out.println(Arrays.toString(arr));

	//}

}
