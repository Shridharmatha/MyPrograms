package com.practice;

public class Engine {
	String name;
	
	Engine(String name){
		this.name=name;
	}
	
	void eon()
	{
		System.out.println(name+" engine started ");
	}

}

class Car
{
	String name;
	Engine e;
	
	Car(String name)
	{
		this.name=name;
		this.e=new Engine("turbo");
	}
	
	void start()
	{
		System.out.println("car started");
		e.eon();
	}
}

class cartest
{
	public static void main(String[] args) {
		Car c=new Car("Curve");
		c.start();
		
	}
}
