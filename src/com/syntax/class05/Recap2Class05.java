package com.syntax.class05;

public class Recap2Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean allergy=true;
		String allergyType="wheat";
		
	if(allergy){
		System.out.println("Lets check what allergy you have");
		
		if(allergyType.equals("Pollen")){
			System.out.println("Try to stay indoors when trees are blooming");
		}else if (allergyType.equals("Peanut")) {
			System.out.println("Please stay away from peanuts");
		}else if (allergyType.equals("Dairy")) {
			System.out.println(("Stay away from dairy produtcs"));
		}else {
			System.out.println("We need to do some test");
		}
		
	}else {
		System.out.println("You are lucky");
	}

}
}