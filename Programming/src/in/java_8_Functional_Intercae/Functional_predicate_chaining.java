package in.java_8_Functional_Intercae;

import java.util.function.Predicate;

public class Functional_predicate_chaining {
	
	public static void main(String[] args) {
		
		Predicate<String>  pre=n ->n.startsWith("S");
		Predicate<String>  pr1=n->n.endsWith("r");
		
		Predicate<String> com=pre.and(pr1);
		System.out.println(com.test("Shridhar"));
	}

}
