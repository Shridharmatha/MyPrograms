package com.practice;

public class Overriding {
	
	
	public void start()
	{
		System.out.println("i am start method");
	}

}
class sub_Overriding extends Overriding
{
	@Override
	public void start()
	{
		//i=10;
		System.out.println("i am overrided method");
	}
	public void start1(int i)
	{
		i=10;
		System.out.println(i);
	}
}

class test_override
{
	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.start();
		
		Overriding o1=new sub_Overriding();
		o1.start();
		
		sub_Overriding o2 =new sub_Overriding();
		o2.start();
		o2.start1(0);
	}
}
