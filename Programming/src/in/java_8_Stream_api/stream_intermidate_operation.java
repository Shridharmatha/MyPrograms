package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_intermidate_operation {
	
	public static void main(String[] args) {
		
		//a) filter() – Filters elements based on a condition
		
		List<Integer> num=Arrays.asList(10,20,30,40,50,60,23,21);
		List<Integer> in=num.stream().filter(n->n%2 !=0).collect(Collectors.toList());
		
		System.out.println(in);
		
		in.forEach(System.out::println);
		
		//b) map() – Transforms each element
		
		List<String> in1=Arrays.asList("apple","banana","mango","chilli");
		List<String> in2=in1.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		in2.forEach(System.out::println);
		
		//or
		
		Stream<String> in3=in1.stream().map(n->n.toUpperCase());
		in3.forEach(System.out::println);
		
		//c) sorted() – Sorts the elements
		
		List<Integer> inp=Arrays.asList(10,20,50,80,90,60);
		Stream<Integer> inp1=inp.stream().sorted();
		inp1.forEach(System.out::println);
		
	}

}
