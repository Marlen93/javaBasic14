package com.syntax.class07;

import java.util.Scanner;

public class HwLanguage {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		
		
        
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
		String language=null;
		
		switch(country) {
		case "El Salvador":
			language="Spanish";
		    break;		    
		case "Britain":
			language="British";
			break;
		case "Portugal":
			language="Portuguese";
			break;
		case "Isreal":
			language="Hebrew";
			break;			
		case "Egypt":
			language="Arabic";
			break;
		case "Thailand":
			language="Thai";
			break;
		case "Japan":
			language="Japanese";
				break;	
		}
		System.out.println("Your language is "+ language );
		
	}

}
