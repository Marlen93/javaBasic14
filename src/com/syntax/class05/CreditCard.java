package com.syntax.class05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
  
		// Create a Java program that will ask if user has a credit card or not. If you
		// user does not have a credit card then offer them. If they do have one ask
		// what is balance on the card? If balance of the card is larger than 1000, tell
		// them to pay off immediately, otherwise you can tell them that they can spend
		// more.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a Credit card");
		boolean CreditCard=scanner.nextBoolean();
		
		if (CreditCard) {
			System.out.println("balance on card");
			int balance=scanner.nextInt();
			
	 	 if (balance>1000) {
			System.out.println("Pay off immediately");
		 }else {
			System.out.println("Spend more money");
		 }
			
		}else {
			System.out.println("Would you like a credit card");			
		}
		
	}

}
