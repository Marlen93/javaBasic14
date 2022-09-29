package com.syntax.class03;

public class Recap {
	
	/*
	 * string concatenation helps us combine a string with any primitive data type together
	 * we can a 
	 */

	public static void main(String[] args) {
		String firstName="Maina";
		String lastName="Henen";
		String fullName=firstName+" "+lastName; //to create space " "
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress= houseNo+city;
		String step1="if we subtract 10 from 5 we get=" +10;//results in string
		//Java doesnt undertand what to do when asked to -
		//String step2=step1-5;
		
		
		System.out.println("if we subtract 10 from 5 we get =" +(10-5)); //when you want to do a string plus an operation 
		
		

	}

}
