package in.code_practice;

public class new_pattern {
	
	    public static void main(String[] args) {
	      int num=5;
	    
	     for(int i=1;i<=num;i++)
	     {
	       for(int j=0;j<=(num-i);j++)
	       {
	         System.out.print("+"+" ");
	       
	         
	       }
	      for(int j=1;j<i;j++)
	      {
	        System.out.print(" "+" ");
	      }
	      
	      for(int j=1;j<=i-1;j++)
	      {
	        System.out.print(" "+" ");
	      }
	      for(int j=num;j>=i;j--)
	      {
	        System.out.print("+"+" ");
	      }
	       
	       System.out.println();
	     }
	     
	     for(int i=2;i<=num;i++)
	     {
	       for(int j=1;j<=i;j++)
	       {
	         System.out.print("+"+" ");
	       }
	       
	       for(int j=num-1;j>=i;j--)
	       {
	         System.out.print(" "+" " );
	       }
	       for(int j=num-i;j>=1;j--)
	       {
	         System.out.print(" "+" ");
	       }
	       for(int j=1;j<=i;j++)
	       {
	         System.out.print("+"+" ");
	       }
	       System.out.println();
	     }
	  }
	}



