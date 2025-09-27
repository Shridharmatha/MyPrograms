package Prog;

import java.util.Arrays;

public class String_Anagrama {
	 public static void sortArray(char []arr)
	    {
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i;j<arr.length-1;j++)
	            {
	                if(arr[i]>arr[j+1])
	                {
	                    char temp=arr[i];
	                    arr[i]=arr[j+1];
	                    arr[j+1]=temp;
	                }
	            }
	        }
	    }
	 public static boolean check_arr(char []arr1,char []arr2)
	 {
		 if(arr1.length!=arr2.length)
		 {
			 return false;
		 }
			 for(int i=0;i<arr1.length;i++)
			 {
				 if(arr1[i]!=arr2[i])
				 {
					 return false;
				 }
			 
		 }
		 return true;
	 }

	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		
		char [] arr1=a.toCharArray();
		char [] arr2=b.toCharArray();
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));		
		
		sortArray(arr1);
		sortArray(arr2);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		if(check_arr(arr1, arr2))
		{
			System.out.println("anagram");
		}
		else
			System.out.println("not anagram");
		

		

	}

}
