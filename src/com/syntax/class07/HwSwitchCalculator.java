package com.syntax.class07;

import java.util.Scanner;

public class HwSwitchCalculator {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int first;
		int second;
		int answer;
		System.out.println("Please enter first number");  
		 first= scanner.nextInt();	 
		 System.out.println("Please enter operator");
		 char operator= scanner.next().charAt(0);
		 System.out.println("Please enter second number"); 
		 second= scanner.nextInt();
		 
		 switch (operator) {
		 
		 case '+':
			 answer=first+second;
			 break;
		 case '-':
			 answer=first-second;
			 break;
		 case '*':
			 answer=first*second;
			 break;
		 case '/':
			 answer=first+second;
			 break;
			 
			 
		 
		 
		 }
	}

}
