package in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listes {
	
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("shridhar");
		lst.add("ammu");
		lst.add("akash");
		lst.add("ramesh");
		//Collections.sort(lst);
		
		//Collections.sort(lst,Collections.reverseOrder());
		//System.out.println(lst);
		//Collections.reverse(lst);
		
		System.out.println(lst);
		System.out.println(lst.get(0));
		System.out.println(lst.remove(3));
		System.out.println(lst.set(2, "ramya"));
		System.out.println(lst);
		System.out.println(lst.indexOf("shridhar"));
		System.out.println(lst.lastIndexOf("rammi"));
		System.out.println(lst.subList(0, 2));
		
		for(String v:lst)
		{
			System.out.println(v);
		}
		
		
		
	}

}
