import java.util.Scanner;

/**
 * @author jaspal singh
 * 
 *         this is a demo sugar smash class.
 *
 */
public class DemoSugarSmash {

	/**
	 * entry point to start application.
	 * 
	 * @param args of string type array.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to online game sugar smash !!! \nPay $2.99 to be a premium member.");
		System.out.print("Please enter your screen name: ");
		var name = sc.nextLine();

		System.out.print("Please enter your id: ");
		var id = sc.nextInt();
		sc.nextLine();

		System.out.println("Please enter the \"Y\" to continue with a permium member");

		var exit = false;

		if ((sc.nextLine()).toUpperCase().equals("Y")) {
			PremiumSugarSmashPlayer premiumPlayer = new PremiumSugarSmashPlayer();

			premiumPlayer.setScreenName(name);
			premiumPlayer.setPlayerId(id);

			System.out.println("Please pay the amount.");
			var amt = sc.nextDouble();
			int counter = 0;
			while (amt == 2.99 && !exit) {
				System.out.println("Please enter your level first!!!");
				var level = sc.nextInt();

				while ((level - 1) <= -1 || (level - 1) >= 40) {
					System.err.println("Please enter valid level allowed.");
					level = sc.nextInt();
				}

				System.out.println("Please enter your highest score against level!!!");
				var highestScore = sc.nextInt();
				sc.nextLine();
				var scores = premiumPlayer.getHighestScore();

				if (level - 1 == 0) {
					premiumPlayer.setHighestScore(highestScore, level - 1);
				} else if (level - 1 > 0 && scores[level - 2] >= 100) {
					premiumPlayer.setHighestScore(highestScore, level - 1);
				} else {
					System.out.println(
							"Level is not available as you have less than 100 point on previous level!!\nPlease enter the high point on previous or press \"E\" to exit");
					var input = sc.nextLine();
					if (input.toUpperCase().equals("E")) {
						exit = true;
					}
				}

			}

			premiumPlayer.display();

		} else {
			SugarSmashPlayer sugarSmashPlayer = new SugarSmashPlayer();
			sugarSmashPlayer.setScreenName(name);
			sugarSmashPlayer.setPlayerId(id);
			while (!exit) {
				System.out.println("Please enter your level!!!");
				var level = sc.nextInt();

				while ((level - 1) <= -1 || (level - 1) >= 10) {
					System.err.println("Please enter valid level allowed.");
					level = sc.nextInt();
				}

				System.out.println("Please enter your highest score against level!!!");
				var highestScore = sc.nextInt();
				sc.nextLine();
				var scores = sugarSmashPlayer.getHighestScore();

				if (level - 1 == 0) {
					sugarSmashPlayer.setHighestScore(highestScore, level - 1);
				} else if (level - 1 > 0 && scores[level - 2] >= 100) {
					sugarSmashPlayer.setHighestScore(highestScore, level - 1);
				} else {
					System.out.println(
							"Level is not available as you have less than 100 point on previous level!!\nPlease enter the high point on previous or press \"E\" to exit");
					if (sc.nextLine().toUpperCase().equals("E")) {
						exit = true;
					}
				}
			}

			sugarSmashPlayer.display();
		}

	}

}
