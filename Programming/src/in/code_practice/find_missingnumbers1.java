package in.code_practice;

import java.util.Arrays;

public class find_missingnumbers1 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2,4, 6,8}; 
        int n = 8; 
        System.out.println(Arrays.toString(arr));

        for(int num=1;num<=n;num++)
        {
         Boolean found=false; 
          for(int i=0;i<arr.length;i++)
          {
          if(arr[i]==num)
          {
            found=true;
            break;
            
          }
          }
          if(!found)
          {
            System.out.println(num);
          }
        }
	}

}
