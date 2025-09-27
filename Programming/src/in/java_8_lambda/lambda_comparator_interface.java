package in.java_8_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambda_comparator_interface {
	
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("shridhar","amullaya","pooja");
		
		//sorting using the collection.sort method and Lambda with Comparator
		Collections.sort(list,(s1,s2)->s1.compareTo(s2));
		list.forEach(System.out::println);
		
		
		//sorting not using the collection.sort method without comparator
		list.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(list);
		
		
		//iteration using stream and filter 
		List<Integer> num=Arrays.asList(1,2,3,4,5,6);
		num.stream().filter(n ->n%2==0).forEach(System.out::println);
		
	}

}
