package com.ak.primitivedemo;

public class PrimitiveClass {

	public static void main(String[] args) {
		byte b= 10;
		
		
		int i1 = b; //widening method type casting implicitly
		int i2 = (int)b; //widening - Explicitly
		
		System.out.println(i1);
		System.out.println(i2);
		
		
//		
//		float f = 16.12f;
//		short c = (short) f; //should only be called the narrowing type casting using explicitly
//		System.out.println(c);
//	
		

		
    byte by = 65;              // 'A'
    char ch = (char) by;   // Convert byte to char
    System.out.println(ch);
    char end = 'Z';          

    for (char c = ch; c <= end; c++) {
        System.out.print(c + " ");
    }
		
		
	}

}
