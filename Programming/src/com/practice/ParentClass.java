package com.practice;

//Parent class
class ParentClass {
 public ParentClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

String name = "Shridhar";
 int age = 25;

 void display() {
     System.out.println("Name : " + name);
     System.out.println("Age: " + age);
 }
}

//Child class extending ParentClass
//class ChildClass extends ParentClass {
// public static void main(String[] args) {
//     ChildClass obj = new ChildClass(); // Object creation
//     obj.display(); // Calling method of ParentClass
// }
//}
