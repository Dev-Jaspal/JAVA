package a2_Jaspal_Singh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class a2_Jaspal_Singh {

	public static void main(String[] args) {
		try
		{
			Scanner scanner = new Scanner(System.in);
//			System.out.println("\n-----------------Using Stack----------------------\n");
//			System.out.print("Please enter string value for palindrome >> ");
//			var inputStr = scanner.nextLine();
//			System.out.println("Is this palindrome: "+isPalindromeString(inputStr));
//			System.out.println("\n-----------------Using Queue----------------------\n");
			System.out.print("Please enter integer value for palindrome >> ");
			var inputInt = scanner.nextInt();
			//System.out.println("Is this palindrome: "+isPalindromeInteger(inputInt));
			isPalindromeInt(inputInt);
			
//			int size = 5;
//			int[] arr = new int[size];
//			generateArray(size, arr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

    private static boolean isPalindromeString(String aString)
    {
    	boolean isPalindrome = false;
    	Stack<Character> stack = new Stack<Character>();
    	String reverseStr="";
    	for (int i = 0; i < aString.length(); i++) {
			stack.push(aString.charAt(i));
			}
    	
    	while (!stack.empty()) {
			reverseStr += stack.pop();
		}
    	
    	if(aString.equals(reverseStr))
    		isPalindrome = true;
    	
    	return isPalindrome;
    }
    
    private static boolean isPalindromeInteger(int anInteger)
    {
    	boolean isPalindrome = false;
    	Queue<Integer> queue = new LinkedList<Integer>();
    	int inputVal = anInteger;
    	int reverse = 0;
    	while(inputVal != 0)
    	{
    		queue.add(inputVal%10);
    		inputVal /= 10;
    	}
    	
    	while(!queue.isEmpty())
    	{
			reverse = reverse*10 + queue.poll();
		}
    	
    	if(anInteger == reverse )
    		isPalindrome = true;
    	
    	return isPalindrome;
    }
    
    public static void isPalindromeInt(int item)
    {
    	String str = String.valueOf(item);
    	String sb = new StringBuilder(str).reverse().toString();
    	Queue<Character> queue = new LinkedList<Character>();
    	for (int i = 0; i < sb.length(); i++) {
			queue.add(sb.charAt(i));
		}
    	System.out.println("Item => " + str);
    	System.out.println("Queue => "+ queue);
    	System.out.println("Queue Peek=> "+ queue.peek());
    	String rev = new String();
    	while(!queue.isEmpty())
    	{
    		rev = rev+queue.poll();
    	}
    	
    	System.out.println("Rev => " + rev);
    	
    	System.out.println("Is Palindrome = > " + ((item == Integer.parseInt(rev))?true:false));
    }
    public static void generateArray(int size, int[] anArray)
    {
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
    	Random random = new Random();
    	for (int i = 0; i < size; i++) {
			queue.add(random.nextInt(100));
		}
    	
    	int counter = 0;
    	while(!queue.isEmpty())
    	{
    		anArray[counter] = queue.poll();
    		counter++;
    	}
    	System.out.println("\n-----------------Using Priority Queue----------------------\n");
    	System.out.print("Sorted array of randomly generated numbers >> ");
    	for (var item : anArray) {
    		System.out.print(item + " ");
		}
    	
    }
}
