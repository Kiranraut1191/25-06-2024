package com.Task;

public class Task {
	
	    public static void main(String[] args) {
	        int num1 = 103;
	        int num2 = 409;
	        int num3 = 455;
	        int num4 = 201;
	        int num5 = 450;

	        // Use conditional operator to find the highest value
	        int highest = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? ((num1 > num5) ? num1 : num5)  : (num4 > num5 ? num4 : num5)) 
	                       : (num3 > num4 ?  (num3 > num5 ? num3 : num5) : (num4 > num5 ? num4 : num5))) : (num2 > num3) ? 
	                       ((num2 > num4) ? (num2 > num5 ? num2 : num5) : (num4 > num5 ? num4 : num5)) : (num3 > num4 ? 
	                        (num3 > num5 ? num3 : num5) : (num4 > num5 ? num4 : num5));

	        System.out.println("The highest value among the given numbers is: " + highest);
	    }
	}
