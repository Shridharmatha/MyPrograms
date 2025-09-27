package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class stream_find_duplicates {
	
	public static void main(String[] args) {
		
		//Find Duplicates
		
		List<Integer> lst=Arrays.asList(1,2,3,4,1,2,6,7,9,4);
		
		Set<Integer> num=new HashSet<>();
		lst.stream().filter(n->!num.add(n))
		.forEach(System.out::println);
		System.out.println(num);
		
		//Find First Element Matching Condition
		
		Optional<String> lst1=Arrays.asList("shrid","ammu","akash","soumya")
		.stream().filter(n->n.startsWith("a")).findAny();
		System.out.println(lst1);
		

	}

}
