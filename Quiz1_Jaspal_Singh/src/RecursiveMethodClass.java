import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jaspal Singh
 * Student Id: 300345938
 */
public class RecursiveMethodClass {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(input < 0) 
		{
			System.out.println("Please enter a valid positive integer number");
		}
		
		new RecursiveMethodClass().printEvenNumbers(input);
	}
   
	public void printEvenNumbers(int n)
	{
		if(n % 2 == 0)
		{
			System.out.print(n + " ");
		}
		
		if(n >= 0)
		    printEvenNumbers(n-1);
		else
			System.out.print("Done.");
	}
}
