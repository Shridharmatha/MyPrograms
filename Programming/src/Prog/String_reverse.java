package Prog;

import java.util.Arrays;

public class String_reverse {
	public static String reverse(String s)
	{
		String res=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			res=ch+res;
		}
		return res;
	}

	public static void main(String[] args) {
		String s="rama is running";
		String [] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String res=reverse(s);
		System.out.println(res);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			String res1=reverse(arr[i]);
			System.out.print(res1+" ");
		}

	}

}
