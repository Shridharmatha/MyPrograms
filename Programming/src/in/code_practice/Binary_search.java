package in.code_practice;

public class Binary_search {
	
	
	//Binary search in descending order
	public static int bsearch(int []arr,int idx)
	{
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==idx)
			{
				return mid;
			}else if(arr[mid]>idx)
			{
				 low=mid+1;
				
			}else
			{
				 high=mid-1;
			}
		}
		return -1;
	}
	
	
	//Binary search in ascending order
	public static int bsearch1(int []arr1,int idx)
	{
		int low=0;
		int high=arr1.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr1[mid]==idx)
			{
				return mid;
			}else if(arr1[mid]<idx)
			{
				 low=mid+1;
				
			}else
			{
				 high=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int []arr= {90,80,70,60,50,40,30,20,10};
		int []arr1= {10,20,30,40,50,60,70,80,90};
		int idx=60;
		int index=bsearch(arr,idx);
		if(index !=-1)
		{
			System.out.println("key descending found : "+index);
		}else
		{
			System.out.println("key not found descending");
		}
		
		int index1=bsearch1(arr1,idx);
		if(index !=-1)
		{
			System.out.println("key ascending found : "+index1);
		}else
		{
			System.out.println("key not found in ascending");
		}
		
	}

}
