package in.java_8_lambda;

import java.util.function.Predicate;

public class lambda_predicate_chaining {
	
	public static void main(String[] args) {
		
		Predicate<String> start=s ->s.startsWith("S");
		Predicate<String> len=s->s.length()==8;
		System.out.println(start.and(len).test("shridhar"));
		
		Predicate<String> end=s ->s.endsWith("Shridhar");
		Predicate<String> endlength=s->s.length()==8;
		System.out.println(end.and(endlength).test("Shridhar"));
		
	}

}
