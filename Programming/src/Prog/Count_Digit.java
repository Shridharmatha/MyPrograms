package Prog;

public class Count_Digit {
	public static int c_digit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4322;
		int digit=c_digit(num);
		System.out.println(digit);
		

	}

}
