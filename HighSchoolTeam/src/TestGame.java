
public class TestGame {

	public static void main(String[] args) {
		Game game = new Game(new Team("Douglas", "Boys’ Basketball", "DBT"),
				new Team("Langara", "Boys' Basketball", "LBT"), "7 PM");
		TestGame.display(game);
	}

	private static void display(Game game) {
		System.out.println("Game start time: " + game.getTime());
		System.out.println("\nFirst Team >>> \nSchool Name: " + game.getFirstTeam().getSchoolName() + "\nSport: "
				+ game.getFirstTeam().getSport() + "\nTeam Name: "+ game.getFirstTeam().getTeamName());
		System.out.println("\nSecond Team >>> \nSchool Name: " + game.getSecondTeam().getSchoolName() + "\nSport: "
				+ game.getSecondTeam().getSport() + "\nTeam Name: "+ game.getSecondTeam().getTeamName());
	}

}
