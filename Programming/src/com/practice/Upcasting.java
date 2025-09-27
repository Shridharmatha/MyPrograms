package com.practice;

public class Upcasting {
	
	public void play()
	{
		System.out.println("i am running");
	}

}

class cars extends Upcasting
{
	@Override
	public void play()
	{
		System.out.println("i am walking");
	}
}

class bike extends Upcasting
{
	@Override
	public void play()
	{
		System.out.println("i am bike running");
	}
}

class testies
{
	public static void main(String[] args) {
		Upcasting u =new Upcasting();
		Upcasting c =new cars();
		Upcasting b=new bike();
		
		u.play();
		c.play();
		b.play();
	}
}
