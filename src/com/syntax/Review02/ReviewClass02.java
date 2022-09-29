package com.syntax.Review02;

public class ReviewClass02 {

	public static void main(String[] args) {
		//explicit/narrowing/manual
		//As we cant fit 129 in byte we will get wrong results
      short largerBox=129;
      byte smallerBox=(byte)largerBox;
      System.out.println(smallerBox);
      
      int largerBox1=129;
	short smallerBox2=(short)largerBox1;
	System.out.println(smallerBox2);
	
	//Implicit
	
	}	

}
