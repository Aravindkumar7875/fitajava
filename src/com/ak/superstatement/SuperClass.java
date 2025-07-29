package com.ak.superstatement;

//Example of super class
//super keyword used to call the super class's parameterized constructor


class A{
	
	public A(int a) {
		System.out.println("Constructor A");
	}
	
}

class B extends A{
	public B(double b) {
		super(10); //calling class A int param constructor , while extends class A, If there is param constructor we should call them
		System.out.println("Constructor B");
	}
}

class C extends B{
	
	public C() {
		super(5.5); //Here only super class of B can only be called
		System.out.println("Constructor C");
	}
}

public class SuperClass {

	public static void main(String[] args) {
		
		C c = new C();

		
	}

}
