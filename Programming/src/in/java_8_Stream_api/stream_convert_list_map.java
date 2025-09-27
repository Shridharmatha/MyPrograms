package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_convert_list_map {
	
	int id;
	String name;
	
	public stream_convert_list_map(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		List<stream_convert_list_map> lst=Arrays.asList(new stream_convert_list_map(1,"shri"),new stream_convert_list_map(2,"ammu"));
		
		Map<Object, Object> stm=lst.stream().collect(Collectors.toMap(s->s.id, s->s.name));
		
		
		System.out.println(stm);
		
	}

}
