package com.practice;

public class remove_sameletter_replace_num {
	
	public static void main(String[] args) {
		
		String s="jdsgyegeghchxunduhcdbccvvbbxgghgggggggg";
		char replaces='g';
		if(s.indexOf(replaces)==-1)
		{
			System.out.println("the index removed");
			//System.exit(0);
			return ;
		}
		
		//char [] arr=s.toCharArray();
		StringBuilder s1=new StringBuilder();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==replaces)
			{
				s1.append(count);
				//arr[i]=String.valueOf(count).charAt(0);
				count++;
			}else
			{
				s1.append(s.charAt(i));
			}
		}
		System.out.println(s1.toString());
		
	}

}
