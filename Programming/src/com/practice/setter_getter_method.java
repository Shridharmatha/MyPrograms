package com.practice;

public class setter_getter_method {
	
	private int id;
	private String name;
//	public setter_getter_method(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	public void setId(int id)
	{
		 this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

}

class stid
{
	public static void main(String[] args) {
		
		//setter_getter_method s=new setter_getter_method(1,"Shridhar");
		setter_getter_method s=new setter_getter_method();
		s.setId(1);
		s.setName("shri");
		System.out.println(s.getId()); 
		System.out.println(s.getName());
	}
}
