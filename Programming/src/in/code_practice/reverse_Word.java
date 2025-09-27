package in.code_practice;

import java.util.Arrays;

public class reverse_Word {
	public static String reverse(String s) { 
		  String res=""; 
		  for(int i=s.length()-1; i>=0; i--) { 
		   res=res+(s.charAt(i)); 
		  } 
		  //System.out.print(res); 
		  return res; 
		  
		 } 
		 public static void main(String[] args) { 
		   
		  String s="its his birthday"; 
		  String [] arr=s.split(" "); 
		  System.out.println(Arrays.toString(arr)); 
		  for(int i=0; i<=arr.length-1; i++) { 
		    
		    String res=reverse(arr[i]); 
		   System.out.print(res+" "); 
		  } 
		   
		  
		 }

	}


