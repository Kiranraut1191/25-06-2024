package com.javaConditionalOperator;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to validate whether the given number is even or odd.
		 * 
		 * Note: use conditional operator/ternary operator(?:).
		 */
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		number = scanner.nextInt();
		
		scanner.close();
		
		String evenNumber = "The given number is an even";
		String oddNumber = "The given number is an odd";
		
		boolean condition = (number%2 == 0);
		
		System.out.println("Condition status: "+condition);
		
		System.out.println(condition ? evenNumber : oddNumber);

	}

}
