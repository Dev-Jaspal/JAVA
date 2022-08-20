package a1_Jaspal_Singh;

import java.util.Scanner;

/**
 * @author Jaspal Singh
 * @version 1.0.0.0
 * Student Id: 300345938
 * This class is use to find ["2 power nth value", "sum of nth value", "factorial of nth value", "fibonacci value"] using 
 * recursive method approach as well as using loop.
 */
public class a1_Jaspal_Singh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Please enter the positive integer value. >> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//validate weather n is positive number or not.
		while(n<0)
		{
			System.out.print("Please enter valid positive integer value. >> ");
			n = sc.nextInt();
		}
		
		System.out.println();
		System.out.println();
		
		//find 2 power nth value
		System.out.println("Using Recursive approach:");
		System.out.println("2^" + n + " is: " + recurpowerOfTwo(n));
		System.out.println("Using Loop approach:");
		System.out.println("2^" + n + " is: " + powerOfTwoUsingLoop(n));
		
		//find sum of nth value
		System.out.println("\nUsing Recursive approach:");
		System.out.println("Sum to " + n + " is: " + recurSumToN(n));
		System.out.println("Using Loop approach:");
		System.out.println("Sum to " + n + " is: " + sumToNusingLoop(n));
		
		//find factorial of nth value
		System.out.println("\nUsing Recursive approach:");
		System.out.println("Factorial of " + n + " is: " + recurfactorial(n));
		System.out.println("Using Loop approach:");
		System.out.println("Factorial of " + n + " is: " + factorialUsingLoop(n));
		
		//find fibonacci value
		System.out.println("\nUsing Recursive approach:");
		System.out.println("Fibonacci value of " + n + " is: " + recurFibonacci(n));
		System.out.println("Using Loop approach:");
		System.out.println("Fibonacci value of " + n + " is: " + fibonacciUsingLoop(n));
	}

	
	/*
	 * This method is using recursive to find 2 power of nth value.
	 */
	public static int recurpowerOfTwo(int power)
	{
		if(power == 0)
		{
			return 1;
		}
		else
		{
			return 2 * (power - 1);
		}
	}
	
	/*
	 * This method is using While loop to find 2 power of nth value.
	 */
	public static int powerOfTwoUsingLoop(int power)
	{
		int response = 1;
		while(power != 0)
		{
			response *= 2;
			power--;
		}
		return response;
	}
	
	/*
	 * This method is using recursive approach to find sum of n value.
	 */
	public static int recurSumToN(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
			return n+ recurSumToN(n-1);
		}
	}
	
	
	/*
	 * This method is using For loop to find sum of n value.
	 */
	public static int sumToNusingLoop(int n)
	{ 
		int sum = 0;
		for(int i=0; i<= n; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	/*
	 * This method is using recursive approach to find factorial of n value.
	 */
	public static int recurfactorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*recurfactorial(n-1);
		}
	}
	
	/*
	 * This method is using While loop to find factorial of n value.
	 */
	public static int factorialUsingLoop(int n)
	{
		int response = 1;
		while(n != 0)
		{
			response *= n;
			n--;
		}
		
		return response;
	}
	
	/*
	 * This method is using recursive approach to find fibonacci value.
	 */
	public static int recurFibonacci(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return recurFibonacci(n-1) + recurFibonacci(n-2);
		}
	}
	
	/*
	 * This method is using For loop to find fibonacci value.
	 */
	public static int fibonacciUsingLoop(int n)
	{
		int first=0;
		int second=1;
		int response=0;
		if (n == 0)	{return 0;}
	    for (int i = 2; i <= n; i++) {
	    	response=first+second;
	        first=second;
	        second=response;
	    }
	    return second;
	}
}
