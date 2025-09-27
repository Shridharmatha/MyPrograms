package in.java_8_Functional_Intercae;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Functional_Interface_Optional {
	
	public static void main(String[] args) {
		
		Optional<String> op=Optional.of("Shridhar");
		op.ifPresent(name ->System.out.println("name :"+name));
		
		
		List<String> names=Arrays.asList("Shridhar","Ammu","Soumya","Jyothi");
		Collections.sort(names, (s1,s2)->s1.compareTo(s2));
		names.forEach(System.out::println);
		
		names.sort((s1,s2)->s1.compareTo(s2));
		names.forEach(System.out::println);
		
	}

}
