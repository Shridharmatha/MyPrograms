package Prog;

public class linear_search {
	public static int linear_searchs(int []arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]==key)
		{
			return i;
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr= {10,19,5,44,7,3,9};
		int key=44;
		int index=linear_searchs(arr,key);
		System.out.println(index);

	}

}
