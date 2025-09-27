package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_Terminal_operations {
	
	public static void main(String[] args) {
		
		//a) forEach() – Iterates over elements 
	     Stream.of("A", "B", "C").forEach(System.out::println); 
	     
	    //b) collect() – Converts a stream into a collection
	     
	     List<String> lst=Arrays.asList("apple","banana","bare").stream().sorted().collect(Collectors.toList());
	     lst.forEach(System.out::println);
	     
	     
	     //c) reduce() – Reduces elements to a single value
	     
	     List<Integer> in=Arrays.asList(1,2,3,4,5,6);
	     int sum=in.stream().reduce(0,Integer::sum);
	    System.out.println(sum);
	    
	    //or 
	    
	    int sum1 = Arrays.asList(1, 2, 3, 4).stream()
	    	    .reduce(0, (a, b) -> a + b);
	    	System.out.println(sum1); // 10
	    
	    
	    //d) count() – Counts the number of elements
	   long coun= Stream.of(1,2,3,4,5,6,7).count();
	    System.out.println(coun);
		
	}

}
