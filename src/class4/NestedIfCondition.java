package class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=5;
		String day="Monday";
		/*
		 * its called outer if-condition if it is true then only inner condition will be closed if it is
		 * false nothing from inner condition will be executed it is like the main door
		 * if main door is closed we cant enter the building
		 */
		//Outer if-condition 
		if(day.equals("Monday")){ //as String is a non primitive we cant use == sign we have to use .equal method
			
			//inner if-conditions 
				if(time>7) {
					System.out.println("Lets go to office");
               }
				
			if(time<6) {
				System.out.println("Lets sleep more");
			}
				
	}

}
}