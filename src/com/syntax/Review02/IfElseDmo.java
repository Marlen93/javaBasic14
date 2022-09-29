package com.syntax.Review02;

public class IfElseDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When using Strings to check if it is equal to, you must write out the word-->.equals("password123")
        String userName="Admin";
        String password="password123";
        //when we have to check if a box contains a value or not we can use == or .equal
        //when the date type is primitive we use== like char int short, ect.
        //when the data types are non-primitive like String we use .equal() 
        if(password.equals("password123"))
        {
            System.out.println("Welcome "+userName);
        }else 
        {
            System.out.println("Wrong password"+userName);
        }

		
	}

}
