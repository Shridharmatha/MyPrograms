package in.code_practice;

import java.util.Scanner;

public class Charecters {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String num=sc.nextLine();
//		for(char c:num.toCharArray())
//		{
//			if(!Character.isLetterOrDigit(c))
//			{
//				System.out.println(c);
//			}
//		}
		
		
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		for(char c:num.toCharArray())
		{
			if(Character.isLetter(c))
			{
				System.out.print(c);
			}
			
		}
		
		
	}

}
