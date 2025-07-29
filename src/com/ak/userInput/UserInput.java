package com.ak.userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter Name");
//		String name = input.nextLine();
//		
//		System.out.println("Enter Age");
//		int age = input.nextInt();
//		
//		System.out.println("Welcome " + name +" "+ "your Age is " + age);
//
//		System.out.println("Enter the value of A");
//		int a = input.nextInt();
//		System.out.println("Enter the value of B");
//		int b= input.nextInt();
//		System.out.println("Enter the value of C");
//		int c = input.nextInt();
//		
//		int d = a*b*c;
//		System.out.println(d);
//		int e = a+b+c;
//		System.out.println(e);
//		
//		int f = d/e;
//		System.out.println(f);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = input.nextInt();

		
		if(num1==num2) {
			
			System.out.println("Number 1 is equal to Number 2");
			
		}
		else {
			System.out.println("Not equals");
		}
				
		
	}

}
