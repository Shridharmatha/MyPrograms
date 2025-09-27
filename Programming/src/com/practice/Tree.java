package com.practice;

public class Tree {
	
	double height;
	Tree(double height)
	{
		this.height=height;
		System.out.println("single parameter");
	}
	Tree()
	{
		System.out.println("zero parameter");
	}

}

class coconuttree extends Tree
{
	coconuttree(double d)
	{
		super();
		System.out.println("super calling statement");
	}
	
	coconuttree()
	
	{
		this(12);
		System.out.println("zero parameter in coconut");
	}
	coconuttree(String s)
	{
		this(45.00);
		System.out.println("dobule value");
	}
	coconuttree(int i)
	{
		this("shri");
		System.out.println("int value");
	}
	
}

class trees
{
	public static void main(String[] args) {
		Tree t=new coconuttree(12);
	}
}
