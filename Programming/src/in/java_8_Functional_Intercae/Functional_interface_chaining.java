package in.java_8_Functional_Intercae;

import java.util.function.Function;

public class Functional_interface_chaining {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> mul=n->n*2;
		Function<Integer,Integer> add=n->n*10;
		
		Function<Integer,Integer> com=mul.andThen(add);
		
		System.out.println(com.apply(5));
		
	}

}
