package com.ak.abstractdemo;


abstract class A{
	
	abstract void func();   //unimplemented function not having body
}


class B extends A{

	//here implemented the abstract class method
	@Override
	void func() {
		System.out.println("helooo");
		
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
		
		//A a = new A();  //object cannot be created for the abstract class
		
		B b = new B();
		b.func();
		// To call the function which is implemented the abstract function

	}

}
