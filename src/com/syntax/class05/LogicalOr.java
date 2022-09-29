package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
///////////////////////using || or/////////////////////////////
		String day="saturday";
		
		if (day.equals("saturday") || day.equals("sunday")) {
			
			System.out.println(" I have Java class at Syntax");
		}
		////////////////////////example using &&/////////////////////////////////
		
        if (day.equals("saturday") && day.equals("sunday")) {
			
			System.out.println(" I have Java class at Syntax");	
			
        }
    //////////////////////////////////////////////////////////////
       double money = 40000;
       
       String title= "Automation Tester";
       
       if(title.equals("Automation Tester") || money ==120000) { //you need at least one true so it can be true
    	   System.out.println("Happy");
       }
        
	}
	

}
