package com.syntax.class08;

import java.util.Scanner;

public class Task2Loop {

	public static void main(String[] args) {
/*
 * creat a secret number and let user guess the secret number
 * once user guessed your number-->program says you won!
 */
		Scanner scanner=new Scanner(System.in);
	int num;
		System.out.println("enter number");
		  num = scanner.nextInt();
		
		  while (num!=4) {
			  System.out.println("try again");
		  }
		  while(num==4){
			  System.out.println("You Won!");
	
		 }
		  
		  
		  System.out.println("================class examle=================");
		  Scanner input = new Scanner(System.in);
	        int secret = 1234;
	        int guess;

	        do {
	            System.out.println("Please guess the secret number: ");
	            guess = input.nextInt();

	        }while(guess != secret);

	        System.out.println("You won!");

}
}
