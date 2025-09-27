package in.code_practice;

public class count_letters {
	public static void main(String[] args) {
		String s="malayalam";
	      int []res=new int[123];
	      
	      for(int i=0;i<s.length();i++)
	      {
	        char ch=s.charAt(i);
	        res[ch]=res[ch]+1;
	       // System.out.println(Arrays.toString(res));
	      }
	      
	      for(int i=0;i<res.length;i++)
	      {
	    	  if(res[i]>0)
	    	  {
	    		  System.out.println((char)i+" "+res[i]);
	    	  }
	      }
	}

}
