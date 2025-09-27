package in.java_8_Stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class stream_flatmap_flaten_list {
	
	public static void main(String[] args) {
		
		List<List<String>> nest=Arrays.asList(Arrays.asList("A","B","C","D"),Arrays.asList("E","F","G","H"));
		List<String> flat=nest.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(flat);
	}

}
