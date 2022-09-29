package com.syntax.class11;

public class Dog {
 //State
//attributes/properties/fields
 String name;
 String color;
 String breed;
 double weight;
 int age;
 //these are the behavoiurs of a dog
 //behavouirs have didnt kinds of names method, functions 
 void bark() {
	 System.out.println("Barking..........");
 }
  void sleep() {
	  System.out.println("Dog is sleeping");
  }
  public static void main(String[]args) {
	  //creating objects from class
	  //new Dog(); =----> it creates an object of class Dog
	  Dog dog1= new Dog();
	  //calling a behaviour on an object
	  dog1.bark();
  }
 
}
