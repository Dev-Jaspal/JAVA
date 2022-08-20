import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InvalidLoanException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<BusinessLoan> arr = new ArrayList<BusinessLoan>();
		boolean exit = true;
		while (exit) {
			System.out.print("Last name >> ");
			var name = sc.nextLine();
			System.out.print("Loan number >> ");
			var num = sc.nextInt();
			System.out.print("Loan amount >> ");
			var amt = sc.nextDouble();
			sc.nextLine();
			System.out.println("want to exit enter E");
			var val = sc.nextLine();
			if (val.toUpperCase().equals("E")) {
				exit = false;
			}

			BusinessLoan bl = new BusinessLoan(num, name, amt);
			arr.add(bl);
		}
		display(arr);
		compare(arr);

	}

	public static void display(ArrayList<BusinessLoan> bl) {
		for (BusinessLoan businessLoan : bl) {
		System.out.println(	businessLoan.toString());
		}
	}

	public static void compare(ArrayList<BusinessLoan> bl) {
		for(int i = 0; i < bl.size()-1; i++)
		{
			System.out.println("Obj " + i+1 + " and obj " + (i+2) +" is equal: " + 
					bl.get(i).equals(bl.get(i+1)));
		}
	
	}

}
