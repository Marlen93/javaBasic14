package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {

		String str="I am always confused i was kidding";
		
		System.out.println(str.indexOf("a")); 
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		System.out.println(str.substring(2));//gives you smaller string we can choose a starting point and it will print out from there
	
		System.out.println(str.substring(5,11));//lets have a start point and end point to print out
	
	}
	

}
