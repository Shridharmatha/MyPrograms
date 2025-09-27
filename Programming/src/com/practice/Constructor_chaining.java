package com.practice;

public class Constructor_chaining {
	
	public Constructor_chaining() {
		this(100);
		System.out.println("i am zero parameterized constructor");
		
	}
	
public Constructor_chaining(int a) {
	this("shri",22);
	System.out.println("i single  parameterized constructor");
		
	}
public Constructor_chaining(String name,int age) {
	System.out.println("double parameterized");
}
	public static void main(String[] args) {
		Constructor_chaining n=new Constructor_chaining();
	}
	

}
