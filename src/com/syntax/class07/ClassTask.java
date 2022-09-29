package com.syntax.class07;

public class ClassTask {

	public static void main(String[] args) {

		//Print numbers from 100 to 1

		int num1=100;
		
		while(num1>=1) {
			System.out.print(num1+" ");
			num1--;
			
		}
		
		System.out.println("=====");
		
		
		
		
		//Print even numbers from 20 to 100 
    
		int num2=20;
		
		while(num2<=100) {
			if(num2%2==0) {
				System.out.print(num2+" ");
			}  num2++;
		}
		 
		
		
		System.out.println("===");
		
		//Print only odd numbers from 100 to 1
		//(2 different ways)
		
		int num3=99;
		
		while(num3>=1) {
			System.out.print(num3+" ");
			num3-=2;
		}
		
	}

}
