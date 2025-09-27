package in.code_practice;

import java.util.Arrays;

public class inputtaking_cprog_outputorderby {
	
	public static void main(String[] args) {
		String s="int main()"
				+ "{"
				+ "int i=0;"
				+ "}";
		char[] chs=s.toCharArray();
		char []ch=new char[s.length()];
		int indx=0;
		
		for(int i=0;i<chs.length;i++)
		{
			if(Character.isLetterOrDigit(chs[i]))
			{
				ch[indx]=chs[i];
				indx++;
			}
			
		}
		
		char []res=new char[s.length()];
		for(int j=0;j<indx;j++)
		{
			res[j]=chs[j];
		}
		
		Arrays.sort(res);
		
		for(char chss:res)
		{
			System.out.print(chss);
		}
		
		
				
	}

}

                      //or
//String s="malayalam3874y43888@#$%^BVGHUY567";
//char[] idx=new char[s.length()];
//int id=0;
// for(char chs:s.toCharArray())
//    if(Character.isLetterOrDigit(chs))
//    {
//      System.out.println(chs);
//     // Arrays.Sort(chs);
//     idx[id]=chs;
//     id++;
//    // Arrays.Sort(idx);
//      
//    }
//    char []ch=new char[s.length()];
//    for(int i=0;i<id;i++)
//    {
//      ch[i]=idx[i];
//    }
//    
//    Arrays.sort(ch);
//    System.out.println(ch);
//    
    
  
