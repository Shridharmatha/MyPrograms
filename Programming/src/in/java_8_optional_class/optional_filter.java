package in.java_8_optional_class;

import java.util.Optional;

public class optional_filter {
	
	public static void main(String[] args) {
		
		Optional<Integer> op=Optional.of(24);
		Optional<Integer> opt=op.filter(a->a>=23);
		System.out.println(opt.isPresent());
		
		Optional<String> opp=Optional.of("shri");
		Optional<String> oppt=opp.filter(a->a.equals("shri"));
		System.out.println(oppt.orElse("no value"));
		
		Optional<String> optt=Optional.of("shridhar");
		optt.ifPresent(n->System.out.println(n));
		
	}

}
