package com.practice;

public class substring_fss {
	
	public static void fss(String s,String res)
	{
		if(s.length()==0)
		{
			System.out.println(res);
			return ;
		}
		fss(s.substring(1),res+s.charAt(0));
		fss(s.substring(1),res);
		
	}
	public static void main(String[] args) {
		
		String s="abc";
		String res="";
		fss(s,res);
		
	}
	

}
