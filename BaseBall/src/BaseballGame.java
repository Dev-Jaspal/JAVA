

public class BaseballGame {

	
	private String fTeam;
	private int[] fScore;
	private String sTeam;
	private int[] sScore;

	public String getfTeam() {
		return fTeam;
	}

	public void setfTeam(String fTeam) {
		this.fTeam = fTeam;
	}

	public int[] getfScore() {
		return fScore;
	}

	public void setfScore(int fScore, int inning) {
		this.fScore[inning-1] = fScore;
	}

	public String getsTeam() {
		return sTeam;
	}

	public void setsTeam(String sTeam) {
		this.sTeam = sTeam;
	}

	public int[] getsScore() {
		return sScore;
	}

	public void setsScore(int sScore, int inning) {
		this.sScore[inning-1] = sScore;
	}

	public BaseballGame(int size) {
		this.fScore = new int[size];
		this.sScore = new int[size];
	}

	public void display() {
		{
			System.out.println("Team Name: " + this.fTeam);
			System.out.println("Team scores: ");
			var len = 1;
			for (var item : fScore) {
				System.out.println("Inning: " + len + "Score: " + item);
				len++;
			}
		}

		{
			System.out.println("Team Name: " + this.sTeam);
			System.out.println("Team scores: ");
			var len = 1;
			for (var item : sScore) {
				System.out.println("Inning: " + len + "Score: " + item);
				len++;
			}
		}
	}

	public void winner() {
		var fScoreTotal = 0;
		var sScoreTotal = 0;

		for (var item : fScore) {
			fScoreTotal += item;
		}

		for (var item : sScore) {
			sScoreTotal += item;
		}

		if (fScoreTotal > sScoreTotal) {
			System.out.println("Team " + this.fTeam + " is winner.");
		} else if (fScoreTotal < sScoreTotal) {
			System.out.println("Team " + this.sTeam + " is winner.");
		} else {
			System.out.println("Tie");
		}
	}

}
