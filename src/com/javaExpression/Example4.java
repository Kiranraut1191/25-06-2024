package com.javaExpression;

public class Example4 {

	public static void main(String[] args) 
	{
        int a = 5;
		
		int expression = 17 - 8 / 4 * 2 + 3 - ++a;	//++ = > a = a + 1	
					   //17 - 8 / 4 * 2 + 3 - 6
					   //17 - 2 * 2 + 3 - 6
					   //17 - 4 + 3 - 6
					   //20 - 4 - 6
					   //20 - 10
					   //1
		
		System.out.println(expression);
		
	}

}
