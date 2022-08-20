import java.util.Scanner;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Please enter integer value");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Select below options: ");
		System.out.println("1. Display\n2. Reverse Display\n3. Sum\n4. Limited Display\n.5 Display Higher Than Avg");
		sc.nextLine();
		var input = sc.nextLine();
		switch(input)
		{
		case "1": 
			displayIntegers(arr);
			break;
			
		case "2": 
			displayIntegersInREverseOrder(arr);
			break;
			
		case "3": 
			integersSum(arr);
			break;
			
		case "4": 
			System.out.print("Search value: ");
			displayLimitedValues(arr, sc.nextInt());
			break;
			
		case "5": 
			displayAvgHigherValues(arr);
			break;
			default:
				System.err.println("Enter valid option");
			
		}

	}

	public static void displayIntegers(int[] arr) {
		for (var item : arr) {
			System.out.println(item);
		}
	}

	public static void displayIntegersInREverseOrder(int[] arr) {
		for (int i = 7; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static int integersSum(int[] arr) {
		int sum = 0;
		for (var item : arr) {
			sum += item;
			System.out.println(item);
		}
		System.out.println("Sum is " + sum);
		return sum;
	}
	
	public static void displayLimitedValues(int[] arr, int val)
	{
		for (var item : arr) {
			if(item <  val)
			{
				System.out.println(item);
			}
		}
	}
	
	public static void displayAvgHigherValues(int[] arr)
	{
		var val = integersSum(arr)/arr.length;
		for (var item : arr) {
			if(item >  val)
			{
				System.out.println(item);
			}
		}
	}
}
