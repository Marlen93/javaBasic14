package com.syntax.class02;

public class NonprimitiveDataType {

	public static void main(String[] args) {
		
		// string is just 1 example of non primitive data type
		
		String name="Asma";
		String address="123 address street";
		String phone= "123 456 7890";
		int age=17; // this is the correct way to write age with int 
		//String age="17"; // anything you put inside "" -> becomes String 
		
		String character="A";
		
		//ctr+space-> auto completes the statement 
		//syso +ctlr +space
		System.out.println(name);
		
		//"My name is"+Asma
		System.out.println("my name is "+name);
		
		// Asma is 17
		System.out.println(name +" is "+age);
		
		String fruit="apple";
		double price=1.99;
		// The price of the apple is 1.99
		
		System.out.println("The price of the "+fruit+" is "+price);
		
		fruit="mango";
		price=5.99;
		//The price of the mango is 5.99
		
		/*to attach any value (int, double, boolean, char, String ect)
		 * to a String we use +
		 * + next to the String acts as concatenation 
		 */
		
		System.out.println("The price of the "+fruit+" is "+price);
		
		
	   
		
		
		

	}

}
