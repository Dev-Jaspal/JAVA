/**
 * 
 */

/**
 * @author jaspa
 *
 */
public class RecurciveGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5, b = 10;   
		System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));   
	}

	static int findGCD(int a, int b)   
	{   
	if (b == 0)   
	return a;     
	return findGCD(b, a % b);   
	}  
}
