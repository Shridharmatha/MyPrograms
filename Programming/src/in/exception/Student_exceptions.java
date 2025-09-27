package in.exception;

import java.util.Arrays;

public class Student_exceptions {
	public static void main(String[] args) {
		int [] arr= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		
		int a,b,c;
		a=10;
		b=0;
		try
		{
			c=a/b;
			System.out.println(arr[5]);
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("arrays is out of bound");
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//System.out.println(Arrays.toString(arr));
	}

}
