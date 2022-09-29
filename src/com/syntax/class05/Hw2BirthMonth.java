package com.syntax.class05;

import java.util.Scanner;

public class Hw2BirthMonth {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc …
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter birth month");
		String month=scanner.nextLine();
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase ("May")) {
			System.out.println("Spring");
			
		}else if (month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Octobur")|| month.equalsIgnoreCase("November")) {
			
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equals("Feburary")) {
			System.out.println("Winter");
		}
		
	}

}
