package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
 
		/*
		 * 3. Ask user to enter a number and then define if number is small, medium or
		 * large Small number 
		 * is value between 1 and 10 Small number 
		 * is value between 11 and 100 medium number 
		 * is value between 101 and 1000 large number
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scanner.nextInt();
		
		if (number>=1 && number<=10) {
			System.out.println("small number");
		}else if (number>=11 && number<=100) {
			System.out.println("medium");
		}else if(number>=101 && number<=1000) {
			System.out.println("large number");
		}
		
	}

}
