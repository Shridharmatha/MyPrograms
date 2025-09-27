package in.code_practice;

public class removeduplicate_elements {
	public static void main(String[] args) {
		String s="12312345656";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
		//	System.out.print(ch);
			//System.out.println();
			int indx=s.indexOf(ch,i+1); 
			if(indx==-1)
			{
				sb.append(ch);
			}
		}
		System.out.print(sb);
	}

}
