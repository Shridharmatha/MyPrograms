package Prog;

public class pebonaci_numbers {

	public static void main(String[] args) {
		
		int i=1;
		int num=5;
		int a=0;
		int b=1;
		while(i<=num)
		{
			System.out.println(a);
			int res=a+b;
			a=b;
			b=res;
			i++;
			
		}

	}

}
