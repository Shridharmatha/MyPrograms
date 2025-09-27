package in.code_practice;

public class max_sum_subarray {
	
	public static int max_sub(int [] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum>max)
				{
					max=sum;
				}
			}
			
		}
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		int []arr= {9,-18,4,12,-6,8};
		int res=max_sub(arr);
		System.out.println(res);
		
		
	}

}
