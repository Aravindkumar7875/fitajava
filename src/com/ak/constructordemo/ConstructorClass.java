package com.ak.constructordemo;

public class ConstructorClass {
	
	int a;
	String abc;
	
	public ConstructorClass() {

		this.a = 20;
	}
	
	public ConstructorClass(int num, String value) {
		this.a = num;
		this.abc = value;
		
	}

	public static void main(String[] args) {
		
		ConstructorClass constructorClass = new ConstructorClass();
		int number = constructorClass.a;
		System.out.println(number);
		
		ConstructorClass constructorClass2 = new ConstructorClass(30, "Aravind");
		
		System.out.println(constructorClass2.abc);

		
		
	}

}
