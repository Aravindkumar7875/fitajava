package com.ak.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = value.nextInt();
		
		if(num >0)
		{
			System.out.println("positive");
		}
		else if(num <0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
