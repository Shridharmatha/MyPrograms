package com.practice;

public class Garbage {
	
	String name;
	
	Garbage(String name)
	{
		this.name=name;
	}
	protected void finalize() throws Throwable
	{
		System.out.println(name +" is eligable to garbage collector");
	}
	public static void main(String[] args) {
		Garbage g1=new Garbage("shri");
		Garbage g2=new Garbage("sou");
		Garbage g3=new Garbage("ammu");
		g2=g1;
		//g2=null;
	
		
		new Garbage("anu");
		System.out.println(g1.name+" "+g3.name+" "+g2.name);
		
		System.gc();
	}

}
