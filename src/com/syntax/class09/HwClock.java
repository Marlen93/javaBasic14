package com.syntax.class09;

public class HwClock {

	public static void main(String[] args) {

	/*
	 * Create a digital clock using nested loops If you can, try to have a clock
	 * that would show 2 digits for hour and 2 digits for minutes
	 */

    String hour,min;
	int h;
	int m;
	  for(h=0; h<=24; h++) {  // hour is controled by inner loop
		  for(m=0; m<60; m++) { // minutes is controled by inner loop
			  if(h<10) {
				hour="0"+h;  
			  }else {
				  hour=""+h;
			  }if(m<10) {
				  min="0"+m;
			  }else {
				  min=""+m;
			  }
			  System.out.println(hour+":"+min);
	  } 
	  }
	}
}
