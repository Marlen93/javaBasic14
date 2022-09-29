package com.syntax.class12;

import java.util.Scanner;

public class TaskStoreUsername {

	public static void main(String[] args) {

		/*
		 * Store username, password and confirm password from a user and check following
		 * requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. Password cannot contain username if so, →
		 * message=”Password cannot contain username”. Password should match confirmed
		 * password, if not → message=“Passwords do not match”.
		 * 
		 * Only after all requirements met → message “Your username and password has
		 * been created”
		 */
		String userName="user1";
		String passWord="pass123";
		String confirmPassWord="pass123";
		
      Scanner scanner=new Scanner(System.in);
      System.out.println("Please enter userName");
       userName=scanner.next();
      System.out.println("Please enter passWord");
       passWord=scanner.next();
       System.out.println("Please Enter the password Again");
       confirmPassWord=scanner.next();
       
		
		if(userName.isEmpty()|| passWord.isEmpty()) {
			System.out.println("username and Password cannot be empty");
		}else if(passWord.length()<8) {
			System.out.println("Password is too short");
		}else if(passWord.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if(!passWord.equals(confirmPassWord)) {
		System.out.println("Password does not match");
	}else {
		System.out.println("Your username and password has been created");
	}
	}

}
