package com.syntax.Review02;

public class NestedIf {

	public static void main(String[] args) {
/*
 * Nested if condition are conditions which are dependent on each other if outer condition is
 * not true inner-condition is never cheched inner-condition is onlt checked when outer-condition is passed
 * 
 */
		int money=10; {
			System.out.println("Lets buy some eggs"); // outer conditions
			int noOfEggs=2;
			
			if(noOfEggs>0) {
				System.out.println("lets boil the eggs");
				
			}
		}
		
	}

}
