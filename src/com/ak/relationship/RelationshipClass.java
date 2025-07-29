package com.ak.relationship;


class Monitor{
	int a = 15;
	
	void func() {
		System.out.println("Func1");
	}
}

class Keyboard{
	int xyz = 20;
	String value = "Aravind";
	
	void func2() {
		System.out.println("Func2 Keyboard");
	}
}


class Computer{
	//computer class is the example of compostion
	//Now we accessing the monitor class and keyboard class here
	
	static Monitor mon = new Monitor();    //Now monitor object created, It is member of computer class now, Hence static keyword assigned
	
	Keyboard key = new Keyboard();
	
	
	
}

public class RelationshipClass {

	public static void main(String[] args) {


		System.out.println(Computer.mon.a);
		
		Computer computer = new Computer();
		int board = computer.key.xyz;
		System.out.println(board);
		
	}

}
