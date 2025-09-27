package in.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiterators {
	
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("shridhar");
		s.add("ammu");
		s.add("Akash");
		s.add("ramesh");
		System.out.println(s);
		
		ListIterator<String> itr=s.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
