package com.javaExpression;

public class Example2 {

	public static void main(String[] args) 
	{

		int a = 10, b = 30, c = 40, d = 60;
		
		int output = a + d / a - c * b % a * b;
				  //10 + 60 / 10 - 40 * 30 % 10 * 30
				  //10 + 60 / 10 - 40 * 0 * 30
				  //10 + 6 - 40 * 0 * 30
				  //10 + 6 - 0
				  //16 - 0
		          //16
		
		/**
		 * operands(variables and constants): a, b, c, d and output
		 * 
		 * operators: +, -, *, /, % and =
		 * 
		 */
		
		System.out.println(output);
		
	}

}
