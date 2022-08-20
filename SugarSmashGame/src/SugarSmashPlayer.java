
/**
 * @author jaspal singh
 * @version 1.0.0.0
 * 
 * this is a sugar smash player class
 *
 */
public class SugarSmashPlayer {

	private int playerId;
	private String screenName;
	private int[] highestScore;
	
	/**
	 * 
	 * @return player id.
	 */
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * 
	 * @param playerId which contains each unique id of player.
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int[] getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore, int level) {
		this.highestScore[level] = highestScore;
	}
	
	public SugarSmashPlayer() {
		this.highestScore = new int[10];
	}
	
	public void display()
	{
		int level = 1;
		System.out.println("Screen Name: "+ getScreenName());
		System.out.println("Player Id: "+ getPlayerId());
		for(var item : getHighestScore())
		{
			System.out.println("Level: " + level + " Score: " + item);
			level++;
		}
	}

}
