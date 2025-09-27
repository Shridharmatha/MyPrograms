package in.code_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class solution {

	    public static void main(String[] args) {
	        String str1 = "aabbcc";
	        String str2 = "swiss";

	        System.out.println("Input1: "+str1);
	        System.out.println("First non-repeating char: "+findFirstNonRepeating(str1));
	        System.out.println("Input2: "+str2);
	        System.out.println("First non-repeating charactar: "+findFirstNonRepeating(str2));
	    }
	    public static String findFirstNonRepeating(String str) {
	        Map<Character,Integer> freq = new LinkedHashMap<Character,Integer>();

	       
	        for (int i=0;i<str.length();i++) {
	            char c=str.charAt(i);
	            if (freq.containsKey(c)) {
	                freq.put(c,freq.get(c)+1);
	            } else {
	                freq.put(c,1);
	            }
	        }
	        for (Character c:freq.keySet()) {
	            if (freq.get(c)==1) {
	                return String.valueOf(c);
	            }
	        }

	        return "-1"; 
	    }
	}



