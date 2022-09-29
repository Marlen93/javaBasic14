package com.syntax.Review05;

import java.util.Scanner;

public class ArraysDemo5 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the number of dresses you want to buy");
		int noOfDresses=scanner.nextInt();
		
		double[] prices=new double[noOfDresses];
		for(int i=0; i<noOfDresses; i++) {
			System.out.println("Please enter the price of dress no "+(i+1));
			prices[i]=scanner.nextDouble();
		}
		System.out.println(prices);
		
		//Limitations of enhanced for loop
		//we can only go in one direction 
		//we can't skip the elements
		//we can't use enhanced for loop to update the elements in an arrays
		//we can only use it to access the elements
		double sum=0;
		for(double price:prices) {
			sum+=price;//sum=sum+price
		}
		System.out.println("Total of all the dresses = "+sum);
	}

}
