package com.syntax.class05;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
       	/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash You are a loan specialist and you need to ask
		 * user what is the amount of loan is needed. If loan is less or equal to
		 * 200,000 then you would lend the money otherwise you would reject the client.
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter mortgage rate");
		double mortgage=scanner.nextDouble();
		
		if (mortgage>=4.5) {
			System.out.println("User will not buy a house");			
		}else {
			System.out.println("User will consider buying");
			System.out.println("Please enter price of house");
			int HousePrice=scanner.nextInt();
			
			if (HousePrice>=200000) {
				System.out.println("User will take a loan");
				System.out.println("Please enter loan needed");
			int loanNeeded=scanner.nextInt();
			
			if(loanNeeded<=200000) {
				System.out.println("loan accepted");
			}else {
				System.out.println("loan rejected");
			}
			}else {
				System.out.println("User will pay cash");
			}
		}
			
		  
		
	}

}
