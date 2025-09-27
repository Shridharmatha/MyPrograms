package in.code_practice;

import java.util.Arrays;

public class find_missingnumbers {
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,10};
	    int []res=arr;
	    int []res1=new int[arr.length*2];
	    int count=0;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		
		for(int i=0;i<arr.length-1;i++)
		{
			int current=arr[i];
			int next=arr[i+1];
			if(current<next)
			{
				System.out.println("hi "+current+" next "+next);
				//res1[i]=arr[i];
				
				for(int num=current+1;num<next;num++)
				{
					res1[count]=num;
					count++;
				}
				
			}
			
		}
		//System.out.println(Arrays.toString(res1));
		int []finall=Arrays.copyOf(res1, count);
		System.out.println(Arrays.toString(finall));
		
	}
	

}
