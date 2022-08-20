import java.util.Scanner;

/**
 * This is a demo class for little leaguebaseball game.
 */

/**
 * @author jaspal Singh
 * @version 1.0.0.0
 */
public class DemoLittleLeaueBaseballGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LittleLeagueBaseballGame bb = new LittleLeagueBaseballGame(6);

		System.out.print("Please enter first team name: " );
		var fName = sc.nextLine();

		System.out.print("Please enter first team name: " );
		var sName = sc.nextLine();

		bb.setfTeam(fName);
		bb.setsTeam(sName);

	
			boolean exit = false;
			int count = 0;
			while(!exit)
			{
				
				System.out.print("Please enter the inning [1-6]: ");

				var inning = sc.nextInt();
				
				while(inning< 1 || inning > 6)
				{
					System.err.print("Please enter the inning [1-6]: ");
					inning = sc.nextInt();
				}
				
				System.out.print("Please enter the score for " + fName + " :");
				var fScore = sc.nextInt();

				System.out.print("Please enter the score for " + sName + " :");
				var sScore = sc.nextInt();

				sc.nextLine();

				var records = bb.getfScore();
				if(inning == 1)
				{
					bb.setfScore(fScore, inning);
					bb.setsScore(sScore, inning);
					count++;
				}
				else if(inning > 1 && records[inning - 2] > 0)
				{
					bb.setfScore(fScore, inning);
					bb.setsScore(sScore, inning);
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
			bb.display();
			bb.winner();
	
	}

}
