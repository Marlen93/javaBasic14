package com.syntax.class12;

public class StirngDemo5 {

	public static void main(String[] args) {

		
		
		 String str="I love java programming";
	        /*
	         * charAt returns us the character at a specific index
	         */
	        System.out.println(str.charAt(3));

	        for(int i=0; i<str.length();i++) {
	            //print only the characters not spaces
	            if(!(str.charAt(i)==' ')) {
	                System.out.println(str.charAt(i));
	            }
		
		
		
		
		
		
		
		
		
		String str="I Love java programming";
		
		System.out.println(str.charAt(3));//to print any char from string
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)=='')){//----> if you want to ignore spaces 
			}
		}
	}

}
