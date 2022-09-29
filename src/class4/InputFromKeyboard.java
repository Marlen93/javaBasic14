package class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
        /*
         * Scanner is a class that helps us take the input from the keyboard 
         * it contains many different smaller modules called methods that can help
         * us take Strings booleans basically all types of data from the keyboard
         */
		Scanner input= new Scanner(System.in);
		// A message will be displayed to the user on the console to enter his/her name
		System.out.println("Please enter your name");
		// Actiates the java program to take the input from the keyboard and store
		//it inside the naem variable
		String name=input.next();
		// print whatever name user enters on the keyboard on the console
		System.out.println("Hello"+name+"dont be confused");
		
		
	}

}
