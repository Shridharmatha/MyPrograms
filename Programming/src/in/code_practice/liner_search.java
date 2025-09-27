package in.code_practice;

public class liner_search {
	
	public static int index(int[]arr,int key)
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
		int []arr= {10,30,50,70,90,40};
		int key=40;
		int idx=index(arr,key);
		System.out.println(idx);
	}

}
