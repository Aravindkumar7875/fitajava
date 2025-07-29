package com.ak.thisstatement;

public class ThisStatement {
	
	public ThisStatement() {
		//this keyword used to mention the parameterized constructor within the class
		this(10);  //this keyword represents the constructor within the class, Here there is integer inside this checks for below constructor with int param
		System.out.println("Constructor1");
	}
	
	public ThisStatement(int a) {
		this(10.5);
		System.out.println("Constructor2");
	}

	public ThisStatement(double b)
	{
		System.out.println("Constructor3");
	}
	
	
	public static void main(String[] args) {
		
		ThisStatement thisStatement = new ThisStatement();
	}

}
