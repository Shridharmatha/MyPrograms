    package in.code_practice;

public class find_max_num {
	public static void main(String[] args) {
		int []arr= {10,20,50,80,60,90};
		int max=0;
		int secondlargest=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondlargest=max;
				max=arr[i];
			}else if(arr[i]>secondlargest && arr[i] !=max)
			{
				secondlargest=arr[i];
			}
			//System.out.println(max);
		}
		System.out.println("maximum number : "+max);
		System.out.println("second largest :"+secondlargest);
		
		
		int [] arr1= {10,20,3,5,40,80,90};
		int min=90;
		int secmin=90;
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j]<min)
			{
				secmin=min;
				min=arr1[j];
			}
			else if(arr1[j]<secmin && arr1[j] !=min)
			{
				secmin=arr1[j];
			}
		}
		System.out.println("minimum number : "+min);
		System.out.println("second minimum number : "+secmin);


		
		
	}
	
	
}
