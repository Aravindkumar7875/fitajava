package com.ak.patterns;

public class PatternPrinting {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i = i+1)
		{
			for(int j = 1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*i-1);k++)  //
			{
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
		for(int i = 1; i<=5; i=i+1)         //row loop
		{
			for(int j = 1; j<=5; j=j+1)     //column loop
			{
				if(i ==1 || i==5 || j==1 || j==5) {
					System.out.print("*");        //gonna print * to the borders, Hence row borders is i ==1 or i ==5, column borders is j== 1 and j==5 
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
		
		
		for(int i = 1; i<=5; i=i+1)
		{
			for(int k=1; k<=5-i;k++)
			{
				System.out.print
				(" ");
			}
			for(int j=1;j<=i;j=j+1)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i=5; i>=1; i--)
		{
			
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<= (2*i-1); j++)
			{
				System.out.print("*");
			}
		

			
			System.out.println(" ");
		}
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

		
}
