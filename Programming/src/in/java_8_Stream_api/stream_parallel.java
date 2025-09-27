package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_parallel {
	
	public static void main(String[] args) {
		
		List<Integer> in=Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> num=in.stream().parallel().filter(n->n%2==0);
		num.forEach(System.out::println);
		
		//or
		
		in.parallelStream().filter(n->n%2==0).forEach(System.out::println);
	}

}
