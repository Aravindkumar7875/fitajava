package com.ak.mthodoverloading;


public class MethodOverloading {

	public static void main(String[] args) {
		
		Sample sample = new Sample();

		sample.add(10, 20);
		sample.add(10, 35, 55);
		sample.add(10, 10.4);

	}
}
	
	class Sample{
		
		void add(int a, int b) {
			System.out.println(a+b);
		}
		
		void add(int a, int b, int c) {
			System.out.println(a+b+c);
		}
		
		void add(int a, double b) {
			System.out.println(a+b);
		}
		
	}


