package in.code_practice;

public class recursive_factorial {
	public static void print_num(int num,int res)
	{
		if(num==0)
		{
			System.out.println(res);
			return;
		}
		print_num(num-1, res*num);
	}
	
	public static void main(String[] args) {
		
		int num=5;
		print_num(num,1);
	}

}
