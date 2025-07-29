package com.ak.whileloop;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int num = 2486;
		int res = 0;
		//step 1 going for while loop
		//step: 2 - getting last vaue using modulus of 10 which gives reminder- as per java and given data it gives last digit when we use 10
		//step: 3 - we gonna store that last digit in a variable, hence created variable and initialise 0;
		//step: 4 - since we using loop, we should let the program to cut the last digit and to run the loop again
		//step: 5 - hence used divided by 10 which gives quotient, below 1st loop its 2486/10 quotient is 248.6, but in java when we use integer
		//          it stores the number alone not the decimal.
		// step: 6 - in the storing of last digits we add the result + rem but it adds all the number, hence we used idea ex) 6+8=14 wrong 
		//           we need 6+8=68 so multiplied the first number *10 and add the res = 6*10=60+8==>68 loops all the numbers and got the result
//			while(num>0)
//			{
//				int rem = num%10; //6
//				
//				res = res *10 + rem ;
//								
//				num = num/10; //cancel the last digit of number as per divison logic, it gives quotient
//
//			}
//			
//			System.out.println("reverse of the given number is : "+res);  //why we set the print statement is it will results the whole number
//			
			
			//amstrong number find
			
			int number  = 153;
			int temp = number;
			int result = 0;
			//using while loop because don't know how many numbers user give and also don't know the iteration
			while(number>0)
			{
				int rem = number%10;    //3
				
				
				result = result + rem*rem*rem;
				
				number = number/10;
				
	
			}
			System.out.println(result);
			if(temp == result) {
				System.out.println("Amstong");
			}
			else {
				System.out.println("Not Amstrong");
			}

			
			//Factorial digit solving
			int digit = 7;
			int tempo = digit;
			int mul= 1;
			while(digit>=1)
			{
				mul = mul*digit;
				digit--;
			}
			
			System.out.println("factorial Number of + "+tempo + ": "+mul);
				
			
		}
	
	
	
		
		
	}

