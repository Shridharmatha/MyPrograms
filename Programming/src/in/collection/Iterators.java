package in.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
	
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("shridhar");
		s.add("ammu");
		s.add("Akash");
		s.add("ramesh");
		System.out.println(s);
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			//String it=itr.next();
			System.out.println(itr.next());
//			if(it.equals("ramesh"))
//			{
//				itr.remove();
//				
//			}	
			
		}
		System.out.println(s);
	}

}
