package com.practice;

public class Student {
	String name;
	int nodrive;
	int mock;
	public Student(String name, int nodrive, int mock) {
		this(name,nodrive);
		this.mock = mock;
	}
	public Student(String name, int nodrive) {
		this(name);
		this.nodrive= nodrive;
	}
	
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", nodrive=" + nodrive + ", mock=" + mock + "]";
	}
	public static void main(String[] args) {
		Student s1=new Student("shri",5,4);
		Student s2=new Student("shri",5);
		Student s3=new Student("shri");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	
	
	
	
}
