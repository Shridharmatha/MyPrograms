package Prog;
import java.util.*;
public class Practice_3 {

	public static void main(String[] args) {
		String s="aabbbbcccfff";
		HashMap<Character,Integer>Map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Map.containsKey(ch))
			{
				Map.put(ch,Map.get(ch)+1);
					
				}else
				{
					Map.put(ch,1);
				}
			}
		System.out.println(Map);
		for(Map.Entry<Character,Integer>e:Map.entrySet())
		{
			System.out.print(e.getKey());
			System.out.print(e.getValue());
		}
		}

	}


