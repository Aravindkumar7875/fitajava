package com.ak.sampleclass;

class FirstClass{
	static int a = 10;    //static keyword representing static data member
	int b = 20;
	
	static void function() {

		System.out.println("Static Function");
	}
	
	void nonfunc() {
		System.out.println("non static function");
	}
	
}

public class SampleClass {

	public static void main(String[] args) {
		
		int c = FirstClass.a;   //syntax to class static variable
		System.out.println(c);
		
		FirstClass.function();
		
		FirstClass f = new FirstClass();   //constructor
		int d = f.b;
		System.out.println(d);
		
		
		f.nonfunc();
		
		
	}

}
