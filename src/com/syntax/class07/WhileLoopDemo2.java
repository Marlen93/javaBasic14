package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {

      //print all numbers from 1 to 10
		
		int num=1;
		
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("---------------------------------------");
		//print all numbers 10 to 25
		
		int a=10;
		
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		//print all numbers from 10 to 1
		
		int b=10;
		
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		//print all number from 50-20
		System.out.println("---------------------------------------");
          int c=50;
		
		while(c>=20) {
			System.out.print(c+" ");
			c--;
		
			System.out.println("---------------------------------------");
		
		//print all even numbers from 1-20
			int num2=2;
			
			while(num2<=20) {
				
				System.out.print(num2+" ");
				num2+=2;	
			}
			System.out.println("Another way from 1 to 20");
			
			int i=1;
			while (i<=20) {
				if (i%2==0) {
					System.out.println(i+" ");
				}
				i++;
			}
		}
	}

}
