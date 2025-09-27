package Prog;

public class char_occure1 {

	public static void main(String[] args) {
		String s="malayalam";
		int [] res=new int[123];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			res[ch]=res[ch]+1;
		}
		//System.out.println(Arrays.toString(res));
		for(int i=0;i<res.length;i++)
		{
			if(res[i]>1)//
			{
				//System.out.println((char)i+" "+res[i]);//for 3st question if(res[i]>1)
				System.out.print((char)i);//for 4nd questionif(res[i]==1)
			}
		}

	}

}
