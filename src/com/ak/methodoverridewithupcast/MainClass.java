package com.ak.methodoverridewithupcast;

class A{
	
	void greet() {
		System.out.println("Hi Aravind.....");
	}
}
	
	class B extends A{
		
		@Override
		void greet() {
			System.out.println("Bye Aravind...");
		}
	}


public class MainClass {

	public static void main(String[] args) {
		

		A a = new A();
		a.greet();
		
		B b = new B();
		b.greet();
		
		//upcasting in method over riding/ Actually, Upcasting defines the parent class member only
		// but here when we give over ride annotation, we have told the system that just acts the child func because its overrided
		//reference variable of parent class
		A a1 = new B();
		a1.greet();
		

	}

}
