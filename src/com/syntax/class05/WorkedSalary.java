package com.syntax.class05;

import java.util.Scanner;

public class WorkedSalary {

	public static void main(String[] args) {
   
		// Write a program to ask user to enter numbers of worked years and annual
		// salary. If user worked for more or equals to 5 years than user is eligible
		// for the bonus, otherwise he is not. Once user is eligible and salary is
		// larger than 50000 than bonus = 5000, otherwise bonus=3000.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of years worked");
		int worked=scanner.nextInt();
		System.out.println("Enter annual salary");
		int salary=scanner.nextInt();
		
		if (worked>=5){
			System.out.println("your eligible for the bonus");
			
		if (salary>50000){
			System.out.println("bonus = 5000");
		}else {
			System.out.println("bonus = 3000");
		}
	}else {
		System.out.println("you aren't eligible");
	}
	}
}
