package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
        double money=5;
		boolean isHungry=true;
		double kfcBurger=11;
		
		if(money>kfcBurger) {
			System.out.println("yayy i can enjoy a burger");
		}else {
			System.out.println("I should make something at home");
		}
		
		if(true) {
			System.out.println("If block");
			
		}
		
		if(false) {
			System.out.println("If block");
		}else {
			System.out.println("else block");
		}
		
		if(isHungry) {;
		System.out.println("lets eat somthing yummy");
	}else {
		System.out.println("Lets watch and do somthing with coding on youtube");
	}
	}
}
