package com.ak.methodoverridewithdowncast;


class Animal{
	void eat() {
		System.out.println("Animal will eat");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog will bark");
	}
}

public class DowncastingClass {

	public static void main(String[] args) {
		
		//Downcasting

		Animal a = new Dog();
		a.eat();
		//a.bark(); throw error
		Dog d = (Dog) a;
		
		d.eat();
		d.bark();
		

	}

}
