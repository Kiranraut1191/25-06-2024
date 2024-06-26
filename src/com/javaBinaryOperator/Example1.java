package com.javaBinaryOperator;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		/**
		 * Note: All arithmetic operators will generate the result as a number.
		 */
		
		int number1, number2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		number1 = scanner.nextInt();
		
		System.out.println("Enter second value: ");
		number2 = scanner.nextInt();
		
		scanner.close();
		
		
		
		System.out.println("+ :"+(number1+number2));
		System.out.println("- :"+(number1-number2));
		System.out.println("* :"+(number1*number2));
		System.out.println("/ :"+(number1/number2));
		System.out.println("% :"+(number1%number2));
		

	}

}

	
		