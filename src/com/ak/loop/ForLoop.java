package com.ak.loop;

public class ForLoop {

	public static void main(String[] args) {
		
		///Implementing for loop
		///A for loop is used when you know exactly how many times you want to repeat something.

		
		for(int i = 1; i<=5; i++) {
			System.out.println("printing the I Values " + i);
		}
		
		
		//print even numbers between 10
		
		for(int i = 1; i<=10;i++) {
			if(i%2 == 0) {
				System.out.println("even numbers : " + i);
			}
	}
		
		for(int i = 10; i>= 2; i--) {
			if(i%2 == 0) {
				System.out.println("even numbers: " + i);
			}
		}

		//sum of numbers using for loop
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			sum = sum + i;
		}
		System.out.println("sum of the numbers : "+ sum);

		
		//nested for loop 
		// 1st loop outer loop has condition to runs the block 2 times
		for(int i = 1; i<=2; i=i+1) {     //value 1 satisfied the condition 1<=2 true goes inside the lopp
			//2nd loop has condition to runs the block for 3 times
			for(int j = 1; j<=3; j=j+1) {
				
				System.out.println("welcome");    //This will print until the second loop satisfies the condition 3 times
				
				}
			System.out.println("Hello");      //outside the 1st loop this print for 1st time
			}
			
		
		//Task is to print ***
					//	   ***
					//     ***
		
//		for(int i = 1; i<= 3; i = i+1)
//		{
//			for(int j = 1; j<= 3; j = j+1)
//			{
//				System.out.print("* ");   // it will print like * * * because of print method
//			}
//			
//			System.out.println();
//			
//		}
		
		for(int i = 1; i<=3; i = i + 1)  //runs the loop for 3 times by the condition
		{
			for (int j = 1; j<=i; j = j + 1) //every time 1st loop runs here its get condition value based on 1st loop value because we set the condition of i 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		/*
		 * for(int i = 1; i<=5; i++) { for(int j = 1; j<= 5-i; j++) {
		 * System.out.print(" "); }
		 * 
		 * for(int k = 1; k<=i; k++) { System.out.print("* "); }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		
	
		

		
		}
		
	}
