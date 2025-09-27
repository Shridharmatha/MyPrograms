package in.code_practice;

public class HCF {
	public static void main(String[] args) {
		
		 int a=24;
	      int b=18;
	      int hcf=(a>b)?a:b;
	      int hcff=1;
	      
	      for(int i=1;i<=hcf;i++)
	      {
	        if(a%i==0 && b%i==0)
	        {
	          hcff=i;
	        }
	       
	      }
	      System.out.println(hcff);
	}

}
