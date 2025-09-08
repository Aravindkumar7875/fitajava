package com.ak.reversestring;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "developer";
		
		StringBuffer stb = new StringBuffer(str);
		
		stb.reverse();
		
		System.out.println(str);
		System.out.println(stb.toString());

		if(str.equals(stb.toString())) {
			System.out.println("str is palindrome");
		}
		else {
			System.out.println("Str is not a palindrome");
		}
		
	}

}
