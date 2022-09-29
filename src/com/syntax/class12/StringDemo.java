package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		//proper way of creating an object
     String str=new String("Java");
     //Simpler and shorter way provided by Java Creator to make our life easier
     String name="Java";//only works with string and Wrapper classes
     /*
      * Counts the amount of characters in a sting including the space
      */
	   
     System.out.println(str.length());
     System.out.println(name.length());
	
	}

}
