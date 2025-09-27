package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_peak {
	
	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("a","b","c","d").stream().peek(System.out::println).map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(lst);
	}

}
