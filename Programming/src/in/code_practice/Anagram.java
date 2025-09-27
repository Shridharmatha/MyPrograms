package in.code_practice;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		System.out.println(arr1);
		System.out.println(arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("anagram");
		}else
		{
			System.out.println("not anagram");
		}
	}

}
