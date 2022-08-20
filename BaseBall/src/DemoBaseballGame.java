import java.util.Scanner;

public class DemoBaseballGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BaseballGame baseballGame = new BaseballGame(9);

		System.out.print("Please enter first team name: " );
		var fName = sc.nextLine();

		System.out.print("Please enter second team name: " );
		var sName = sc.nextLine();

		baseballGame.setfTeam(fName);
		baseballGame.setsTeam(sName);

	
			boolean exit = false;
			int count = 0;
			while(!exit)
			{
				
				System.out.print("Please enter the inning [1-9]: ");

				var inning = sc.nextInt();
				
				while(inning< 1 || inning > 9)
				{
					System.err.print("Please enter the inning [1-9]: ");
					inning = sc.nextInt();
				}
				
				System.out.print("Please enter the score for " + fName + " :");
				var fScore = sc.nextInt();

				System.out.print("Please enter the score for " + sName + " :");
				var sScore = sc.nextInt();

				sc.nextLine();

				var records = baseballGame.getfScore();
				if(inning == 1)
				{
					baseballGame.setfScore(fScore, inning);
					baseballGame.setsScore(sScore, inning);
					count++;
				}
				else if(inning > 1 && records[inning - 2] > 0)
				{
					baseballGame.setfScore(fScore, inning);
					baseballGame.setsScore(sScore, inning);
					count++;
				}
				else {
					System.err.println("Inning is not avaiable. Enter \"E\" to Exit");

					if(sc.nextLine().toUpperCase().equals("E"))
					{
						exit = true;
					}
				}
			
				if(records[records.length -1] != 0)
				{
					exit = true;
				}
		}

			
			baseballGame.display();
			baseballGame.winner();
	/*	{
			boolean exit = false;
			int count = 0;
			while(!exit || count > 9)
			{
				System.out.print("Please enter the score for " + sName + " :");
				var score = sc.nextInt();

				System.out.print("Please enter the inning [1-9] corresponding to score " + score + " of team " + sName+": ");

				var inning = sc.nextInt();
				sc.nextLine();

				var records = baseballGame.getsScore();
				if(inning == 1)
				{
					baseballGame.setsScore(score, inning);
					count++;
				}
				else if(inning > 1 && records[inning - 2] > 0)
				{
					baseballGame.setsScore(score, inning);
					count++;
				}
				else {
					sc.nextLine();
					System.err.println("Inning is not avaiable. Enter \"E\" to Exit");
					var userInput = sc.nextLine();
					if(userInput.toUpperCase().equals("E"))
					{
						exit = true;
					}
				}
			}
		}*/

	}

}
