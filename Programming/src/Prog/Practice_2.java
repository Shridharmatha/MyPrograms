package Prog;

import java.util.Arrays;

public class Practice_2 {

	public static void main(String[] args) {
		String in="a2b4c4e2";
		String res="";
		String res1="";
		char [] ch=in.toCharArray();
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<in.length();i++)
		{
			if(i%2==0)
			{
				res=res+in.charAt(i);
				res1=res+res;
				
			}
			//if(res1=='a')
			
		}
		System.out.println(res1);
		

	}

}
