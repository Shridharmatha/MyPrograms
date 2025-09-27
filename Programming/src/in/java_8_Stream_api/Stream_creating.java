package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Stream_creating {
	
	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("Apple","banana","mango","apple");
		
		Stream<String> stm=lst.stream();
		stm.forEach(System.out::println);
		
		Set<String> set1=new HashSet<>(Arrays.asList("hhhhhd","dhvdhc","bdcdc","dhvdhc"));
		
		//Set<String> set=Set.of("hhhhhd","dhvdhc","bdcdc","dhvdhc");
		Stream<String> stm1=set1.stream();
		stm1.forEach(System.out::println);
		
	}

}
