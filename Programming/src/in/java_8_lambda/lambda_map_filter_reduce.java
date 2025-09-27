package in.java_8_lambda;

import java.util.Arrays;
import java.util.List;

public class lambda_map_filter_reduce {
	
	public static void main(String[] args) {
		
		List<Integer> in=Arrays.asList(1,2,3,4,5);
		int sum=in.stream()
				.filter(n ->n%2 !=0)        // filter odd
				.map(n->n*n)               // square them
				.reduce(0, Integer::sum);  // sum them
		System.out.println(sum);           // 35 (1 + 9 + 25)
	}

}
