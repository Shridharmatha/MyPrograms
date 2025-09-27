package in.code_practice;

import java.util.Arrays;

public class rotate_arr_aniclock {
	
	//rotate in anti clock wise
//	public static void rotate(int [] arr)
//	{
//		int temp=arr[0];
//		int temp1=arr[1];
//		for(int i=2;i<arr.length;i++)
//		{
//			arr[i-2]=arr[i];
//		}
//		arr[arr.length-1]=temp;
//		arr[arr.length-2]=temp1;
//	}
//	public static void main(String[] args) {
//		int []arr= {10,20,30,40,50,60};
//		rotate(arr);
//		System.out.println(Arrays.toString(arr));
//	}
	
	//arr in clock wise
	public static void rotate(int [] arr)
	{
		int temp=arr[arr.length-3];
		int temp1=arr[arr.length-2];
		int temp2=arr[arr.length-1];
	
		for(int i=arr.length-1;i>=3;i--)
		{
			arr[i]=arr[i-3];
		}

		arr[0]=temp;
		arr[1]=temp1;
		arr[2]=temp2;
	}
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}

}
