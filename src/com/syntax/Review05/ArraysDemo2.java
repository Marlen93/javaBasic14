package com.syntax.Review05;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {

		String[] dresses=new String[] {"Pink Dress","cocktail","Summer Dress","Night Dress","Pencil Dress"};
		//last index is always size-1 Bc arrays index starts from zero
		System.out.println(dresses.length);
		//this is how you will mostly use arrays
		for(int i=0; i<dresses.length;i++) {	
		System.out.println("Lets try"+dresses[i]);
		
	}
		//enhanced for loop
	for(String dress:dresses) {
		System.out.println(dress);
	}
	System.out.println("=============with out Loop=====================");
	//prints all elemints of an array without a Loop 
	
	System.out.println(Arrays.toString(dresses));

}
}