package in.java_8_Functional_Intercae;

import java.util.Arrays;
import java.util.List;

public class Functional_interface_filter {
	
	public static void main(String[] args) {
		
		List<String> in=Arrays.asList("Shridhar","ammu","soumya");
		in.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
	}

}
