package com.syntax.class06;

import java.util.Scanner;

public class EnhancedHwMonth {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter birth month");
		String month=scanner.nextLine();
		
		String season=null;
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase ("May")) {
			season="spring";
			
		}else if (month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Octobur")|| month.equalsIgnoreCase("November")) {
			season="fall";
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equals("Feburary")) {
			season="winter";	
      	}else {
      		System.out.println("enter vaild month");
      	}
		System.out.println(season+"is the season you were born in");
	}
}
