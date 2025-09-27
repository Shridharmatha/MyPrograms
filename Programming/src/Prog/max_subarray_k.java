package Prog;

public class max_subarray_k {
	public static void max_sum(int [] arr)
	{
		int k=3;
	  int sum1=0;
	  for(int i=0;i<k;i++)
	  {
		  sum1=sum1+arr[i];
	  }
	  int max=sum1;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			
			for(int j=i;j<i+k;j++)
			{
			   sum+=arr[j];
			}
			   if(sum>max)
			   {
				   max=sum;
			   
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int [] arr= {9,-18,4,12,-6,8};
		max_sum(arr);
		

	}

}
