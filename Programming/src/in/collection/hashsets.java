package in.collection;

import java.util.HashSet;

public class hashsets {
	
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>(); 
		hs.add("shri");
		hs.add("shri");
		hs.add(null);
		hs.add(10);
		
		System.out.println(hs);
	}

}
