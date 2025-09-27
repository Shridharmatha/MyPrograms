package in.java_8_lambda;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class lambda_count_frequency {
	
	public static void main(String[] args) {
		
		Map<String,Long> lst= Arrays.asList("banana","apple","banana","ornage")
		.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(lst);
	}

}
