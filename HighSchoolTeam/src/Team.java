
public class Team {

	public final static String MOTTO = "Sportsmanship!";

	private String schoolName;
	private String sport;
	private String teamName;

	public String getSchoolName() {
		return schoolName;
	}

	public String getSport() {
		return sport;
	}

	public String getTeamName() {
		return teamName;
	}

	public Team(String _schoolName, String _sport, String _teamName) {
		this.schoolName = _schoolName;
		this.sport = _sport;
		this.teamName = _teamName;
	}
}
