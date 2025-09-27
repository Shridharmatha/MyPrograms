package in.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterations {
	public static void main(String[] args) {
      Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "shridhar");
		map.put(2, "ammu");
		map.put(3, "don");
		map.put(4,"soumya");
		
		
		Set<Integer> k=map.keySet();
		
		for(Integer key:k)
		{
			System.out.println(key);
		}
		
		Collection<String> val=map.values();
		System.out.println(val);
		
		Set<Map.Entry<Integer, String>> ms=map.entrySet();
		System.out.println(ms);
		
		Iterator<Map.Entry<Integer,String>> itr=ms.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
