package Prog;

public class MAX_sum_subarry {
	public static void max_sum(int []arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
				
			{
				sum+=arr[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
	 int[] arr= {9,-18,4,12,-6,8};
	 max_sum(arr);

	}

}
