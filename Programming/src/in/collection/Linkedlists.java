package in.collection;

import java.util.LinkedList;

public class Linkedlists {
	
	public static void main(String[] args) {
		LinkedList<String> lk=new LinkedList<>();
		lk.add("shridhar");
		lk.add(null);
		lk.add("shridhar");
		lk.add("akash");
		
		System.out.println(lk);
		System.out.println(lk.get(2));
	}

}
