package com.practice;

import java.util.Scanner;

public interface Switchs {
	
	void on();
	void off();
	
}

class TubeLight implements Switchs
{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("tubelight is on");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("tubelight is off");
	}
	
}

class Bulb implements Switchs
{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("bulb is on");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("bulb is off");
	}
	
}

class LightFactory
{
	public static Switchs getLight(String type)
	{
		if(type.equalsIgnoreCase("TubeLight"))
		{
			return new TubeLight();
		}else if(type.equalsIgnoreCase("Bulb"))
		{
			return new Bulb();
		}
		else {
			System.out.println("in valid");
			return null;
		}
		
		
		
	}
}

class switchtest
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("enter the type of bulb");
			String input =sc.next();
			Switchs sw=LightFactory.getLight(input);
			if(sw!=null)
			{
				sw.on();
				sw.off();
			}
		}
		
	}
}
