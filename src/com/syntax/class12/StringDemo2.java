package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		String firstName="Olena";
        String lastName="Dudka";
        System.out.println(firstName+lastName); // Mostly this is used
        System.out.println(firstName.concat(" ").concat(lastName));
        
        String str="";
        /*
         * isEmpty() returns true if String is empty this method will return false even if you have a space in string variable 
         * however the isBlank method does not count the space.
         */
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());		
	}

}
