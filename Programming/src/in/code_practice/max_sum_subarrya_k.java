package in.code_practice;

public class max_sum_subarrya_k {
	
	public static int subarr(int [] arr)
	{
		//int max=0;
		int sum1=0;
		int k=3;
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
				 sum=sum+arr[j];
			 }
				 if(sum>max)
				 {
					 max=sum;
				 }
			 
			
		 }
		 return max;
		
		// System.out.println(max);
	}
	public static void main(String[] args) {
		int [] arr= {9,-18,4,12,-6,8};
		int res=subarr(arr);
		System.out.println(res);
		
}
}
