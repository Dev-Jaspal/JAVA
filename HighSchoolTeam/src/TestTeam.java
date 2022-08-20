
public class TestTeam {

	public static void main(String[] args) {
		Team obj = new Team("Roosevelt High", "Girls’ Basketball", "Dolphins");
		System.out.println("\nObject 1\n");
		TestTeam.display(obj);
		
		Team team = new Team("Douglas", "Boys’ Basketball", "DBT");
		System.out.println("\nObject 2\n");
		TestTeam.display(team);
		
		Team teamObj = new Team("Langara", "Boys' Basketball", "LBT");
		System.out.println("\nObject 3\n");
		TestTeam.display(teamObj);

	}

	private static void display(Team obj) {
		System.out.println("Motto: " + Team.MOTTO);
		System.out.println("School Name: " + obj.getSchoolName());
		System.out.println("Sport Name: " + obj.getSport());
		System.out.println("Team Name: " + obj.getTeamName());
	}
}
