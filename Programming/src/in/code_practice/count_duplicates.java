package in.code_practice;

import java.util.HashMap;

public class count_duplicates {
	
	public static void main(String[] args) {
		String s="PentagonSpace";
		HashMap< Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!map.containsKey(ch))
			{
				map.put( ch,1);
			}else
			{
				int value=map.get(ch);
				map.put(ch,value+1);
			}
		}
		System.out.println(map);
		
		for(char chs:map.keySet())
		{
			System.out.println(chs+" "+map.get(chs));
		}
		
	}
	

}
