package Prog;
import java.util.*;

public class Array_basics {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++)
		{
		   System.out.println(arr[i]);
		//System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		int k=12;
		System.out.println("before adding");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=k;
			k+=10;
			//System.out.println(arr[i]);
			System.out.println(Arrays.toString(arr));
		}
		//System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++)
//		{
//			//System.out.println(arr[i]);
//			System.out.println(Arrays.toString(arr));
//		}

	}

}
