package com.ak.whileloop;

public class StrongNumber {

	public static void main(String[] args) {

		int num = 145;
		int sum = 0;
		
		int temp = num;
	
		//1 4 5 
		
		while(num>0)
		{
			int rem = num%10; //5
			
			sum = sum + factorial(rem);
		
			num = num/10;
			
			//System.out.println(sum);
		}
		
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a strong Number");
		}
			
	}
	
	public static int factorial(int n) {
		
		int mul = 1;
		//int res = 0;
		
		while(n>0) {
			mul = mul * n;
			n--;
		}
		return mul;
		
	}
	
	
	//Fibonacci Series

	// if the value is 5, 5 times 
	
	public static void fibonacci(String[] args) {

	
	int n = 5;
	int a = 0;
	int b = 1;
	
	System.out.println(a);
	System.out.println(b);
	
	n = n-2;

	while(n>0)
	{
		int c = a+b;
		System.out.println(c);
		
		a = b;
		b = c;
		n--;
		
	}
	
	
}
	

}
