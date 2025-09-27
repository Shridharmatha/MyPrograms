package in.java_8_Functional_Intercae;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transform_list_function {
	
	public static void main(String[] args) {
		
		List<String>  lst=Arrays.asList("a","bc","abc","bc","a");
		
		List<Integer> length=lst.stream().map(s->s.length()).toList();
		System.out.println(length);
		
		//or
		
		List<String> lst1=Arrays.asList("a","b","c","gdgd","gdd");
		
		List<Integer> length1=lst1.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(length1);
		
		
		//ForEach with consumer
		
		List<Integer> in=Arrays.asList(1,2,3,4,5,6);
		in.forEach(S->System.out.println("Value :"+S));
		
		//Generate List with Supplier
		
		Supplier<String> supp=()->"Shridhar";
		List<String> lst2=Stream.generate(supp).limit(5).collect(Collectors.toList());
		System.out.println(lst2);
		
	}

}
