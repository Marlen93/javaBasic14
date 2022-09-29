package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {

		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		//replace good with excellent-----replace method of string with another string
		System.out.println(str.replace("good","Ecellent"));
		System.out.println(str.replaceAll("[a-z]","#"));
		
	}

}
