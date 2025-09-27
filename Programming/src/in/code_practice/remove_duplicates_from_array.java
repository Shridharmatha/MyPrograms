package in.code_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicates_from_array {
	
	public static void main(String[] args) {
		
		int []	arr= {1,2,2,3,4,4,5};
		
		Set<Integer> sett=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			sett.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sett);
		
		
		
		
//------------------------------------>  |or| <-----------------------------------------------
		
		int k=0;
		
		int [] arr1=new int[arr.length-2];
		
		for(int i=0;i<arr.length;i++)
		{
			boolean duplicate=false;
			
			for(int j=0;j<k;j++)
			{
				
				if(arr[i]==arr1[j])
				{
					
					duplicate=true;
					break;
				}
			}
				
				if(!duplicate)
				{
					duplicate=false;
					arr1[k]=arr[i];
					k++;	
			}	
		}
		System.out.println(Arrays.toString(arr1));		
	}

}
