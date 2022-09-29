package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		/*we need to ask a user where he/she is from
		 * based on the country->define favorite food
		 * 
		 */
		
		Scanner in=new Scanner(System.in);
		 System.out.println("Please tell me where you are from?");
		 String country=in.nextLine();
		 String favoriteFood= null;
		 
		 switch(country) {
		 
		 case "use":
			 favoriteFood="burgers and fries";
			 break;
		 case "Kazakhstan":
			 favoriteFood="beshparmark";
			 break;
		 case "Turkey":
			 favoriteFood="adana kebab";
			 break;
		 case "Venezuela":
			 favoriteFood="Arepa";
			 break;
		 case "India":
			 favoriteFood="chicken curry";
			 break;
		 case "Yemen":
			 favoriteFood="Mandi";
			 break;
		 case "Afghanistan":
			 favoriteFood="Qaboli Palow";
			 break;
		default:
			favoriteFood="Unknown";
			break;
			 
			 
		 
		 
		 }
		
	}

}
