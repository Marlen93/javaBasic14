package class4;

import java.util.Scanner;

public class InputFromKeybord3 {

	public static void main(String[] args) {
		/*
		 * just using scanner to fuse asma
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		//takes a String type input from keyboard amd stores in name variable
		String name=scanner.nextLine();
		System.out.println("Please Enter your age");
		// takes an int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you are "+age+" years old");
		
	}

}
