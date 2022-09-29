package com.syntax.class07;

import java.util.Scanner;

public class HwGrade {

	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */
		 
        char grade;
		String Explanation;
        
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scanner.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			Explanation="Excellent";
			break;
		case 'B':
			Explanation="Good";
			break;
		case 'C':
			Explanation="Average";
			break;
		case 'D':
			Explanation="Bad";
			break;
		default:
			Explanation="Not acceptable";
			break;
		}
		System.out.println(grade+"="+Explanation);
	}

}
