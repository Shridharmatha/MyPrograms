package in.java_8_Functional_Intercae;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Function_interface {
	
	public static void main(String[] args) {
		
		//function interface
		
		Function<String, Integer> getl=s ->s.length();
		System.out.println(getl.apply("shridhar"));
		
		//Predicate interface problem
		
		Predicate<Integer> intt=s->s%2==0;
		System.out.println(intt.test(4));
		
		//using consumer interface 
		Consumer<String> ms=s->System.out.println("out put is "+s);
		ms.accept("functional interface");
		
		//using supplier interface
		
		Supplier<Double> d=()->Math.random();
		System.out.println(d.get());
		
		//BiFunction interface
		
		BiFunction<Integer,Integer,Integer> bi=(a,b) ->a+b;
		System.out.println(bi.apply(10, 50));
		
		//Unary operator interface
		
		UnaryOperator<Integer> in=x->x*x;
		System.out.println(in.apply(8));
		
		
		//BinaryOperator interface
		
		BinaryOperator<Integer> in1=(a,b)->a*b;
		System.out.println(in1.apply(10, 20));
		
		
	}

}
