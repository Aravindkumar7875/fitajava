package com.ak.primenumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(isPrime(n));
		
		if(isPrime(n)== true)
		{
			System.out.println("Its a Prime Number");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}


	static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i = 2; i< num;i++)
		{
			if(num%i==0)
			{
				//System.out.println("Its Prime");
				return false;
			}
			
		}
		
		return true;
		
		
		
	}
		

}
