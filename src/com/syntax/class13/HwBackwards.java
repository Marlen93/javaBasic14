package com.syntax.class13;

public class HwBackwards {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).

		String str="Sunday";
		
		for(int i=str.length()-1; i>=0;i++) {
			System.out.println(str.charAt(i));
			
		}
		char[] charArr=str.toCharArray();
		for(int i=charArr.length-1;)
		
	}

}
