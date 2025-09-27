package in.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<>();
		map1.put(5, "shri");
		map1.put(6, "amulya");
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "shridhar");
		map.put(2, "ammu");
		map.put(3, "don");
		map.put(4,"soumya");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.remove(3));
		System.out.println(map);
		
		System.out.println(map.containsValue("shridhar"));
		System.out.println(map.containsKey(1));
		System.out.println(map.remove(4,"soumya"));
		map.putAll(map1);
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		 // keySet() - returns Set of all keys
		
		Set<Integer> k=map.keySet();	
		
		for(Integer key:k)
		{
			System.out.println(key);
		}
		
	   // values() - returns Collection of all values
		
		Collection<String> val=map.values();
		
		for(String value:val)
		{
			System.out.println(value);
		}
		
		
		Set<Map.Entry<Integer, String>> ms=map.entrySet();
		System.out.println(ms);
		
		//void clear()
//		map.clear();
//		System.out.println(map);
	}

}
