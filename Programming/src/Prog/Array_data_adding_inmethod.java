package Prog;

import java.util.Arrays;

public class Array_data_adding_inmethod {
	//adding data 
	public static void add_ele(int[] arr,int ele,int index,int[]res)
	{
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i];
		}
		res[index]=ele;
		for(int i=index;i<arr.length;i++)
		{
			res[i+1]=arr[i];
		}
	}

	public static void main(String[] args) {
		int [] arr={10,20,30,40,50,60,70};
		int index=4;
		int ele=42;
		int [] res=new int[arr.length+1];
		add_ele(arr,ele,index,res);
		System.out.println(Arrays.toString(res));
		
		

	}
	//deleting data
//	public static void add_ele(int[] arr,int index,int[]r)
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			r[i]=arr[i];
//		}
//		for(int i=index+1;i<arr.length;i++)
//		{
//			r[i-1]=arr[i];
//		}
//	}

//	public static void main(String[] args) {
//		int [] arr={10,20,30,40,50,60,70};
//		int index=4;
//		//int ele=4;
//		int [] res=new int[arr.length+1];
//		add_ele(arr,index,res);
//		System.out.println(Arrays.toString(res));
		
		

//}

}
