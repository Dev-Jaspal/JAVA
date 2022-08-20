import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Please enter quiz score or 99 to exit.");
		Scanner scn = new Scanner(System.in);
		var input = scn.nextInt();
        int sum = 0;
		while (input != 99) {
			if (input >= 0 && input <= 10) {
				arr.add(input);
				sum += input;
			}
			System.out.println("Please enter quiz score or 99 to exit.");
			input = scn.nextInt();
		}
		
		System.out.println("Max: " + Collections.max(arr));
		System.out.println("Min: " + Collections.min(arr));
		System.out.println("Average: " + sum/arr.size());
	}

}
