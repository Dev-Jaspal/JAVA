import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jaspal Singh
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter value. >> ");
		var str = sc.nextLine();
		if(palindrome(str))
		{
			System.out.println("Yes " + str +" is a palindrome...");
		}
		else
		{
			System.out.println("No " + str +" is not a palindrome...");
		}
		
		if(isPalindrome(str, 0, str.length()-1))
		{
			System.out.println("Yes " + str +" is a palindrome...");
		}
		else
		{
			System.out.println("No " + str +" is not a palindrome...");
		}

	}

	public static boolean palindrome(String str)
	{
		if(str.length()<= 1)
		{
			return true;
		}
		else if(str.charAt(0) != str.charAt(str.length()-1))
		{
			return false;
		}
		else {
			return palindrome(str.substring(1, str.length()-1));
		}
	}
	
	public static boolean isPalindrome(String str, int low, int high)
	{
		if(high <= low)
		{
			return true;
		}
		else if(str.charAt(low) != str.charAt(high))
		{
			return false;
		}
		else
		{
			return isPalindrome(str, low+1, high-1);
		}
	}
}
