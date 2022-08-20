
public class Game {
    private Team firstTeam;
    private Team secondTeam;
    private String time;
    
    public Team getFirstTeam()
    {
    	return firstTeam;
    }
    
    public Team getSecondTeam()
    {
    	return secondTeam;
    }
    
    public String getTime()
    {
    	return time;
    }
    
    public Game(Team firstTeam, Team secondTeam, String time )
    {
    	this.firstTeam = firstTeam;
    	this.secondTeam = secondTeam;
    	this.time = time;
    }
}
