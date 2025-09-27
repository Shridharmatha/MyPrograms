package com.practice;

public class demo {
	
	demo()
	{
		this("hi"); 
		System.out.println("zero parameter");
	}
	 demo(String s)
	{
		this(100);
		System.out.println("string");
	}
	 
	 demo(double s1)
		{
		
			System.out.println("double ");
		}
	 demo(int i)
	 {
		 System.out.println("integer");
	 }

}

class tes
{
	public static void main(String[] args) {
		demo d=new demo();
	}
}
