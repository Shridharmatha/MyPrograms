package in.java_8_lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambda_with_predicate {
	
	public static void main(String[] args) {
		
		//Using Predicate interface
		
		Predicate<String> p= (s)-> s.length()<=8;
		System.out.println(p.test("Shridhar"));
		
		
		//Using function interface
		
		Function<Integer,String> in=n->n+" is number";
		System.out.println(in.apply(10));
		
		//Using consumer Interface
		
		Consumer<String> con=s ->System.out.println("name is "+s);
		con.accept("Shridhar");
		
		//Using Supplier
		
		Supplier<Double> num=()->Math.random();
		System.out.println(num.get());
		
		//Using BiFunction
		
		BiFunction<Integer, Integer, Integer> multiply=(a,b)->a*b;
		System.out.println(multiply.apply(10, 30));
				
	}

}
