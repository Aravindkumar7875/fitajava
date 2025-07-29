package com.ak.corejava;

public class FirstClass {

	public static void main(String[] args) {
		
		boolean f = false;
		
		byte b = 127;
		
	
		String abc = "Hi Hello";
		
		System.out.println(abc);
		
		//modulus % operator gives reminder 
		//divide / operator gives quotient
		int num = 0;
		
		int res = num%2;
		System.out.println(res);
		
		if(num%2 ==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		if(num > 0) {
			System.out.println("positive");
		}
		else if (num <0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}

}
