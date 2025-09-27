package com.practice;

public class printing_chars_from_string {
	
	
	public static void main(String[] args) {
		String s="a2b3c4";
		StringBuilder in=new StringBuilder();
	
		for(int i=0;i<s.length();i+=2)
		{
			char ch=s.charAt(i);
			int count=s.charAt(i+1)-'0';
			
			for(int j=0;j<count;j++)
			{
				in.append(ch);
				
			}
			
			
		}
		System.out.println(in.toString());
		
		
		
		//in another way 
		
		
		
//		String s="a2b3c4";
//		String out="";
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(Character.isDigit(s.charAt(i+1)))
//			{
//				int count=s.charAt(i+1)-'0';
//				
//				for(int j=0;j<count;j++)
//				{
//					out+=ch;
//				}
//				i++;
//			}
//			
//
//		}
//		System.out.println(out);
		
	}
}
