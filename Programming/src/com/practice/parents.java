package com.practice;

import java.util.*;
public class parents {
	
	parents(){
	super();
	System.out.println("zero parameter");

}
}
class childs extends parents{
	childs(int i)
	{
		super();
		System.out.println("i am parameterized");
		
	}
}

class tests{
	public static void main(String[] args) {
		childs c=new childs(10);
	}
}
