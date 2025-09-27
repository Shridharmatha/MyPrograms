package com.practice;

public class Student1 {
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	String name;
	int age;
	double height;
	public Student1(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	

}
class std extends Student1
{
	
	@Override
	public String toString() {
		return "std [address=" + address + ", num=" + num + ", name=" + name + ", age=" + age + ", height=" + height
				+ "]";
	}
	String address;
	int num;
	public std(String name, int age, double height,String address,int num) {
		super(name, age, height);
		this.address=address;
		this.num=num;
		
	}
	
}

class sts extends Student1
{
	@Override
	public String toString() {
		return "sts [place=" + place + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	String place;

	public sts(String name, int age, double height, String place) {
		super(name, age, height);
		this.place = place;
	}
	
}

class testes
{
	public static void main(String[] args) {
		Student1 s=new std("shri",22,167,"banglore",46555);
		System.out.println(s);
		Student1 s1=new sts("shri",22,167,"vijayanagr");
		System.out.println(s1);
	}
	
}
