import java.util.Scanner;

public class EvenEntry {

	public static void main(String[] args) {

		System.out.print("Please enter even number or 999 to exit");
		Scanner scn = new Scanner(System.in);
		var input = scn.nextLine();

		while (!input.equals("999")) {

			if (Integer.parseInt(input) % 2 == 0) {
				System.out.println("Good job!");
			} else {
				System.out.println("Error: wrong input please enter even number.");
			}

			System.out.print("Please enter even number or 999 to exit");
			input = scn.nextLine();
		}

		System.exit(0);
	}

}
