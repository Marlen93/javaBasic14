package com.syntax.class06;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 * 
		 */

		 Scanner scanner=new Scanner(System.in);
		 int quiz=0;
		 int midterm=0;
		 int finalScore=0;
		 char grade='0';
	     int Average=0;
	     
		
		 System.out.println("Please enter quiz score");
	     quiz=scanner.nextInt();
	     System.out.println("please enter midterm score");
	     midterm=scanner.nextInt();
	     System.out.println("Please enter finalScore");
	     finalScore=scanner.nextInt();
	     
	     Average=(quiz+midterm+finalScore)/3;
			
	     
	     if (Average<=100 && Average>=90 ) {
	    	 grade='A';
	     }else if(Average<=90 && Average>=70){
	    	 grade='B';
	     }else if(Average<=70 && Average>=50) {
	    	 grade='C';
	     }else if (Average<=50 && Average>=0) {
	    	 grade='F';
	     }
	     System.out.println("with the Average score of " +Average+" Your grade is "+grade);
	}
	
}    
	