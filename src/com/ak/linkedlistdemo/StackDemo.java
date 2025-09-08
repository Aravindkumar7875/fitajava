package com.ak.linkedlistdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		//stack exmaples
		//stack means arraning te books in bucket
		//Here LIFO server last in first out
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(30);
		stack.push(50);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());


	}

}
