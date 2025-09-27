package in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Withoutgeneric {
	public static void main(String[] args) {
		//List<Withoutgeneric> lst=new ArrayList<>();
		Collection c=new ArrayList();
		c.add("shridhar");
		c.add("ammu");
		c.add(1000);
		System.out.println(c);
	}

}
