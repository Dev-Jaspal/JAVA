
/**
 * @author jaspal singh
 *
 * this is a permium smash player class.
 */
public class PremiumSugarSmashPlayer extends SugarSmashPlayer {

	private int[] highestScore;

	@Override
	public int[] getHighestScore() {
		return highestScore;
	}

	@Override
	public void setHighestScore(int highestScore, int level) {
		this.highestScore[level] = highestScore;
	}

	public PremiumSugarSmashPlayer() {
		highestScore = new int[40];
	}
}
