package com.syntax.Review05;

public class Array2DDemmo1 {

	public static void main(String[] args) {

		String[] individuals1=new String[] {"Sabej","Shah","Mina"};
		String[] individuals2=new String[] {"Roman","Mina"};
		String[] individuals3=new String[] {"Asad","Priyasri","Ali"};
		
		String [][] rooms=new String[3][];
		
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		System.out.println(rooms[2][2]);
		
		System.out.println("===================");
		
		String[] individualsInRoom1= new String[] {"Sabej","Shah","Mina"};
        String[] individualsInRoom2= new String[] {"Roman","Mina"};
        String[] individualsInRoom3= new String[] {"Asad","Priyasri","Ali"};
        // an 2D array that will store 3 single d arrays 
        String [][] rooms=new String[3][];


        rooms[0]=individualsInRoom1;
        rooms[1]=individualsInRoom2;
        rooms[2]=individualsInRoom3;

        System.out.println(rooms[2][2]);
		
	}

}
