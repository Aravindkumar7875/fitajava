package com.ak.reversestringloop;

public class ReverseStringLoop {

	public static void main(String[] args) {
		String str = "madam";
		String reversed = "";

		
		for(int i = str.length()-1; i >=0; i--) {
			reversed+=str.charAt(i);
		}
		
		System.out.println(str);
		System.out.println(reversed);
		
		//palindrome is equals the word when its reversed
		if(str.equals(reversed)) {
			System.out.println("Str is a palindrome");
		}
		else {
			System.out.println("Str is not a palindrome");
		}
		
	}

}
