package in.java_8_Stream_api;

import java.util.stream.Stream;

public class stream_generating_infinite {
	
	public static void main(String[] args) {
		
		Stream<Integer> stm=Stream.iterate(1, n->n+1);
		stm.limit(10).forEach(System.out::println);
	}

}
