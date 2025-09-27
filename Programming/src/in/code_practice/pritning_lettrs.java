package in.code_practice;

import java.util.Arrays;

public class pritning_lettrs {
	
	public static void main(String[] args) {
		//String name="Shridhar";
//		for(int i=0;i<name.length();i++)
//		{
//			if(i%3 ==0)
//			{
//				System.out.println(i);
//				//System.out.println("");
//				System.out.println(name.charAt(i));
//			}
//		}
		
		
		String s="rama went to school he is genius";
		String []arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("words at even positions ");
		
		for(int j=0;j<=arr.length;j++)
		{
			if(j%2==0)
			{
				System.out.println(arr[j]);
			}
		}
		
	}

}
