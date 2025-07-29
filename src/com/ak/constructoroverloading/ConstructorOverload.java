package com.ak.constructoroverloading;


class Sample{
	
	int x;
	double y;
	String Z;
	
	public Sample() {

		System.out.println("Empty Constructor");
		
	}
	
	public Sample(int a) {
		this.x = a;
		
	}
	
	public Sample(int a, double b) {
		this.x = a;
		this.y = b;
		
	}
	
	public Sample(int a, String value) {
		this.x = a;
		this.Z = value;
	}
	
}

public class ConstructorOverload {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		System.out.println(sample.x);
		System.out.println(sample.Z);

		Sample sample2 = new Sample(7, "aravind");
		System.out.println(sample2.Z);
		
	}

}
