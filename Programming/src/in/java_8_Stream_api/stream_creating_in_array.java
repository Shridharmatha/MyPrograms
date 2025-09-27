package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class stream_creating_in_array {
	
	public static void main(String[] args) {
		
		String [] arr= {"Shridhar","ammu","soumya"};
		Stream<String> stm=Arrays.stream(arr);
		stm.forEach(System.out::println);
		
		//find max or min
		
		Optional<Integer> max = Arrays.asList(2, 5, 1).stream().max(Integer::compare);
		System.out.println(max.get()); // 5
		
		//or
		
		Optional<Integer> max1=Arrays.asList(1,9,10).stream().reduce((a,b)->a>b ?a:b);
		System.out.println(max1);

	}

}
