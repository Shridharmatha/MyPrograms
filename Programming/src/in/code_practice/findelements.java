package in.code_practice;

import java.util.HashMap;
import java.util.Map;

public class findelements {
	public static void main(String[] args) {
		String s="ssssssssssssssrrrtttrrttffgggffdsdddddffrf";
		Map<Character,Integer> map=new HashMap();
		char []chs=s.toCharArray();
		for(char ch:chs)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}else
			{
				int value=map.get(ch);
				map.put(ch, value+1);
				
			}
			
		}
		System.out.println(map);
	}

}
