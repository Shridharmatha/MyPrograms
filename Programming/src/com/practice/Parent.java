package com.practice;
import java.util.*;

public class Parent {
  
  Parent()
  {
    System.out.println("i am super class zero parameter");
  }
}
class Child extends Parent
{
  Child(int i)
  {
    System.out.println("i am super class parameterized");
  }
  
}
class Test{
  
    public static void main(String[] args) {
      Child c=new Child(100);
  }
}