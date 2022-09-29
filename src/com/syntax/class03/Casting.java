package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
     /*
      * type casting => type = data type casting= converting 
      * converting one data type to another () to convert 
      */
		byte box1=127; // smallest box 
		short box2=3333;// double the size of box1 in terms of bits/ slightly larger box 
		int box3=45454545;// 32 bits/ large box most commonly used 
		long box4=45454545;//slightly large box 
		float box5=414564545;//larger box
		double box6=454545445;//largest 
		
		int number=(int)15.2; //we cant store the decimal in box of type int /
		System.out.println(number);
		
		byte smallerBox=(byte)box2; 
		System.out.println(smallerBox);
		
		long smallerBox1=(long)box2;
		System.out.println(smallerBox1);
		
		short biggerBox=box1;
		
		long box7=box1; //we can do this Bc box 7 is larger then box 1
			
		float box8=(float)box6; // as box6 is larger it is double we need type casting to assign the value 
		
		char a=(char)67; //Char goes by the ASCII Table
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		
	}

}
