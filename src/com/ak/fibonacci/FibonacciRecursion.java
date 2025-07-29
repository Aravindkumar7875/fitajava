package com.ak.fibonacci;

public class FibonacciRecursion {

	public static void main(String[] args) {
		
		System.out.println(fib(5));
	}
	
	
	
	static int fib(int n)
	{
		
		if(n<=1)
		{
			return n;
			
		}
		
		return fib(n-1)+ fib(n-2);  //breaks into small piece and again loops the method repeatedly
		
		
		
	}
	

}
