package in.code_practice;

import java.util.Arrays;

public class change_date_format {
	
	public static void main(String[] args) {
		
		String s="1999/12/31";
		String [] newdate=s.split("/");
		
		String newDate=newdate[2]+"/"+newdate[1]+"/"+newdate[0];
		
		System.out.println(Arrays.toString(newdate));
		System.out.println(newDate);
		
	}

}
