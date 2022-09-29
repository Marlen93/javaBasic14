package com.syntax.class08;

public class TaskLoop {

	public static void main(String[] args) {
		
		//from the range of 1 to 50
		//find the sum of all even and all odd numbers
		int sumEven;
		int sumOdd;
		
		for(int num=1; num<=50;num++) {
			if(num%2==0) {
				
			}
		}
		
		System.out.println("=======class example========");
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);

	}

}
