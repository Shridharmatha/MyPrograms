package com.practice;

public class Human {
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	String name;
	int age;
	int height;
	public Human(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	

}
class Students extends Human
{
	@Override
	public String toString() {
		return "Students [village=" + village + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	String village;
	public Students(String name, int age, int height,String village) {
		super(name, age, height);
		this.village=village;
		
	}

	
	
}

class Employee extends Human{

	@Override
	public String toString() {
		return "Employee [rollnum=" + rollnum + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	int rollnum;
	public Employee(String name, int age, int height,int rollnum) {
		super(name, age, height);
		this.rollnum=rollnum;
	}
	
}

class testcontroll
{
	public static void main(String[] args) {
		Students s=new Students("shridhar",23,164,"bardol");
		Employee e=new Employee("ram",24,165,1);
		
		System.out.println(s);
		System.out.println(e);
	}
}