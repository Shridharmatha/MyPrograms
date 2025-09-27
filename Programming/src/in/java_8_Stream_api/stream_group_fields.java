package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_group_fields {
	
	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("one","two","three","four");
		Map<Integer,List<String>> gro=lst.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(gro);
		
		
		List<String> lst1=Arrays.asList("shri","durga","pg");
		String stm=lst1.stream().collect(Collectors.joining(" ,"));
		System.out.println(stm);
	}

}
