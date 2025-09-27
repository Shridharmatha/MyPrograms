package Prog;

public class Array_max_min {
	
	//finding max value

//	public static void main(String[] args) {
//		int [] arr= {57,64,32,84,95,23};
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//
//	}
	
	//finding min values
	public static void main(String[] args) {
		int [] arr= {57,64,32,84,95,23};
		int max=95;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
