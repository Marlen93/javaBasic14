package com.syntax.class05;

import java.util.Scanner;

public class Dmv {

	public static void main(String[] args) {
     	/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver licence to them, otherwise you will
		 * offer them to get a learners permit.
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter age");
		int age=scanner.nextInt();
		if (age>=18) {
			System.out.println("issue drivers licsens");
		}else {
			System.out.println("get a learners permit");
		}
		
	}

}
