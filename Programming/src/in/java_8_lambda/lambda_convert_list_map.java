package in.java_8_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class lambda_convert_list_map {
	
	int id;
	String name;
	
	public lambda_convert_list_map(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		List<lambda_convert_list_map> students=Arrays.asList(new lambda_convert_list_map(1,"Shridhar"),new lambda_convert_list_map(2,"Ammu"));
		
		Map<Integer,String> map=students.stream().collect(Collectors.toMap(s->s.id, s->s.name));
		System.out.println(map);
		
	}

}
