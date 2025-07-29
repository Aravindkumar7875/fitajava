package com.ak.inheritancedemo;

//example of Inheritance Is - a relationship
class A{
	int x = 20;
}
//extends keyword used for Inheritance process linking with parent class
class B extends A {
	int y = 30;
}

class C extends B{
	int z = 40;
}


public class InheritanceClass {

	public static void main(String[] args) {

		//every class called in main class or another class by creating object;
		
		A a = new A();
		System.out.println(a.x);
		
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);

		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
	}

}
