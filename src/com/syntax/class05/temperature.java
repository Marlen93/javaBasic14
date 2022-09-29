package com.syntax.class05;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
 
		// Create a Java program that will ask user to input city and temperature. Your
		// program should convert Fahrenheit into celsius and print “The temperature is
		// the city is ”
		
		// -32 * .5556
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Please enter city ");
		String city=scanner.nextLine();
		System.out.println("please enter temerature");
		double temp=scanner.nextDouble();
		double temp1=(temp-32)*.5556;
		System.out.println("The temperature is "+temp1+" the city is "+city);
		
		
	}

}
