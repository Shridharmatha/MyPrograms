package in.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithGeneric {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("shridhar");
		s.add("ammu");
		s.add("Akash");
		s.add("ramesh");
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.contains("ramesh"));
		Object[] arr=s.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(s);
		
		System.out.println(s.indexOf("ammu"));
		System.out.println(s.lastIndexOf(""));
		
		
		List<String> c=new ArrayList<>();
		c.add("manu");
		c.add("privin");
		System.out.println(c);
		
		List<String> college=new ArrayList<>();
		college.addAll(c);
		college.addAll(s);
		boolean cs=college.containsAll(s);
		System.out.println(cs);
	}

}
