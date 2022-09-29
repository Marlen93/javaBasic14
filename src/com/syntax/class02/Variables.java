package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		String name = "Marlen";
		String lastname ="Martinez";
		char grade = 'b';
		String city = "Bowie";
		String state = "MD";
		String phone = "301-218-8536";
		
		System.out.println("My name is "+name);
		System.out.println("I am "+grade+"grade student");
		System.out.println("I live in city "+city);
		System.out.println("And my phone number is "+phone);
		
	//Changes
		city = "Fairfax";
		state = "VA";
		phone = "703-500-5555";
		grade = 'A';
		
        System.out.println("My name is "+ name);
        System.out.println(" I am " +grade+"grade student");
        System.out.println("I live in city "+city);
        System.out.println("And my phone number is "+phone);
        System.out.println("My name is "+name+"and  I moved"); // keep working on this marlen
        
        // Rules for identifiers=names (variables, method
        // 1. cannot use keywords as identifiers 
       // String new ="Hello";->error
        
        // 2. cannot have spaces in identifiers 
        //Sting last name="smith"->error
        
        //identifiers cannot start with numbers
        //int 1number=123;-> error
       // int number1=123//number can be used anywhere after name 
        
        /* 4. identifiers cannot contain any special character 
         * boolean hello!=true;
         * char #chara='A';
         * 
         * except $ or _
         * 
         */
        double $price$=9.98;
        float _price1_=1.99F;
        
        /*
         * Naming Conventions 
         * 
         * class should start with uppercase and follow camel cases 
         * 
         * Variables should start with uppercase following 
         * 
         * variables should start with lowercase and 
         */
        String Weather="hot"; // not preferred 
        String myWeather="cold"; //preferred
        		
        

	}

}
