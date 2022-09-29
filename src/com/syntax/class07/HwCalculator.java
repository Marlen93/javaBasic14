package com.syntax.class07;

import java.util.Scanner;

public class HwCalculator {

	public static void main(String[] args) {

		/*
		 * : Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		
		Scanner scanner=new Scanner(System.in);
		int first;
		int second;
		System.out.println("Please enter first number");  
		 first= scanner.nextInt();
		 
		 System.out.println("Please enter operator");
		 char operator= scanner.next().charAt(0);
		 
		 System.out.println("Please enter second number");
		 
		 second= scanner.nextInt();
		 
		 if(operator=='+') {
			 System.out.println(first+second);
		 }else if(operator=='-') {
			 System.out.println(first-second);
		 }else if(operator=='*') {
			 System.out.println(first*second);
		 }else if (operator=='/') {
		    System.out.println(first/second); 
		 
		 }
	}

}
