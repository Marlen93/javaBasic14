package com.syntax.Review04;

import java.util.Scanner;

public class ScannerLoopDemo {

	public static void main(String[] args) {

	 Scanner scanner=new Scanner(System.in);
	 /*
	  * 12345
	  * 12345
	  * 12345
	  * 
	  */
		// you dont want to copy past five times
	 for(int i=1; i<=5; i++) {
		 System.out.println();
	 }
	 
	 //this is the way want to do it 
	 
	 for(int j=0; j<5; j++) {
		 for(int i=1; i<=5; i++) {
			 System.out.println(i+" ");
		 }
		 System.out.println();
	 }
	 
	 
	}

}
