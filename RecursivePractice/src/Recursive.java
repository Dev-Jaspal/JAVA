import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter x value"); var x = sc.nextInt();
		 * 
		 * 
		 * System.out.println("Please enter y value"); var y = sc.nextInt();
		 * 
		 * 
		 * System.out.println(Recur(x, y));
		 */
		// System.out.println(Exponent(x, y));
		//System.out.println(Sum(x));
		
		  int[] arr = {1,2,3,4,5}; var val = RecursiveSearch(3,arr, 0, arr.length-1);
		  System.out.println(val);
		 
	}

	private static int Recur(int x, int y) {
		if (x == 0) {
			return 0;
		}

		y = y + Recur(x - 1, y);
		return y;
	}

	private static int Exponent(int x, int y) {
		if (y == 0) {
			return 1;
		}

		y = x * Recur(x, y - 1);
		return y;
	}

	private static int Sum(int x) {
		if (x == 0) {
			return 0;
		}

		x = x + Sum(x - 1);
		return x;
	}

	private static boolean RecursiveSearch(int element, int[] arr, int i, int j) {
		if (i > j) {
			return false;
		}

		if (arr[i] == element) {
			return true;
		}

		if (arr[j] == element) {
			return true;
		}

		return RecursiveSearch(element, arr, i + 1, j - 1);

	}

}
