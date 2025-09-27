package in.java_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class prime {
	
	public static void main(String[] args) {
		
		List<Integer> p=Arrays.asList(1,2,3,4,5,6);
		p.stream().filter(s->s%2==0).forEach(System.out::println);
		
		Predicate<String> ss=s->s.length()>10;
		System.out.println(ss.test("donhbhffcdgf"));
		
		Predicate<String> s2=s1->s1.startsWith("s");
		System.out.println(s2.test("Shridhar"));
		
		Function<String,String> ff=f1->"start with s "+f1;
		System.out.println(ff.apply("shridhar"));
	
	}
	
	
	
}
