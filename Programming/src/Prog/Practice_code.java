package Prog;

import java.util.Arrays;

public class Practice_code {

	public static void main(String[] args) {
		String input="Move#hash#to#first";
		String res="";
		String res1="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='#')
			{
				 res+=input.charAt(i);
			}
			else
				 res1+=input.charAt(i);
				
		}
		
		System.out.print((res));
		System.out.println((res1));
		

	}

}
