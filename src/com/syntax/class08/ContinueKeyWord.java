package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// CONTINUE skips and goes to the next cycle 
		//continues to the next iteration/cycle moment Java sees continue

		for(int i=1; i<5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
			
		}
		//I want to print numbers from 1 to 20 except number 3,7,11
		
		for(int i=1; i<=20;i++) {
			
			if(i==3 || i==7 || i==11) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
