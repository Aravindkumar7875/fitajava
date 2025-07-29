package com.ak.blocksdemo;

public class BlocksClass {


	static int a;
	int b;
	
	//BlocksClass obj = new BlocksClass();
	
	public static void main(String[] args) {

		System.out.println("Main Method");

		BlocksClass blocksClass = new BlocksClass();
		
	}
	
	
	static {
		//static block
		a = 10;
		System.out.println(a);
		
	}
	
	{
		//non static block not to specify non static keyword;
		//non static block will be executed only when creating object
		b= 20;
		System.out.println(b);
	}

}
