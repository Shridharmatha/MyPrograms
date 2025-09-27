package Prog;

public class Binary_search_descending {

		public static int binery_searchs(int [] arr,int key)
		{
			int low=0;
			int high=arr.length-1;
			while(low<=high)
			{
				int mid=(low+high)/2;
				if(arr[mid]==key)
				{
					return mid;
				}
				else if(key<arr[mid])
				{
					return mid+1;
				}
				else 
					high=mid-1;
			}
			return -1;
		}

		public static void main(String[] args) {
			int [] arr= {80,70,60,50,40,30,20,10};
			int key=70;
			int index=binery_searchs(arr,key);
			System.out.println(index);

		}


	}


