package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
   
		
		//matching cases must be of the same data type as a variable
		//no duplicated case in switch
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
		    answer="Yes";
		    break;
		case 'N':    
		    answer="No";
		    break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;	    
		}
		System.out.println(answer);
		//Limitation of SWITCH CASE
		/*
		 * cannot use logical operators
		 *cannot use  relational operators
		 */
		
		/*
		 * CANNOT work with boolean values
		 * boolean boo=true;
		 * cannot use double 
		 */
		//boolean boo=true;
		//switch (boo) {
		
		}
		
	}


