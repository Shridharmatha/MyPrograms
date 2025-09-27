package com.practice;

public class Course {
	String name;
	int duration;
	double fees;
	public Course(String name, int duration, double fees) {
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	
	void info()
	{
		System.out.println("started student registeration");
		System.out.println("course name "+this.name);
		System.out.println("course duration "+this.duration);
		System.out.println("course fees "+this.fees);
	}
}

class Stud
{
	String name;
	Course c;
	Stud(String name)
	{
		this.name=name;
	}
	
	void reg(Course c)
	{
		this.c=c;
		System.out.println(name+" is registred");
		c.info();
	}
}

class Studetest
{
	public static void main(String[] args) {
		Stud s=new Stud("Shridhar");
		Course c=new Course("java developer",6,25000.00);
		s.reg(c);
	}
}