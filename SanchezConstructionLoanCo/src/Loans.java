import java.util.Scanner;

public class Loans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loans[] loansArr = new Loans[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter current prime interest rate >>");
		var primeInterestRate = sc.nextDouble();
		
		System.out.println("Enter loan type.");
		var loanType = sc.nextLine();
		
		int count = 0;
		while(count < 5)
		{
			System.out.print("Enter loan number >>");
			var loanNum = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter customer last name >>");
			var name = sc.nextLine();
			System.out.print("Enter loan amount >>");
			var amount = sc.nextDouble();
			
			System.out.print("Term >>");
			var term = sc.nextLine();
			
			if(loanType.equals("BusinessLoan"))
			{
				BusinessLoan businessLoan = new BusinessLoan(primeInterestRate, loanNum, name, amount, term);
			}
		}
		
		while(count > 0)
		{
			
		}
	}

}
