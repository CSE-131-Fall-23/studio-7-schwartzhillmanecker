package studio7;

public class HockeyPlayer {

	// instance variables
	private String name;
	private int jerseyNum;
	private String shootingPref;
	private int goals;
	private int assists;
	
	// contructor method. Doesn't have a return type
	
	public HockeyPlayer( String initName, int initNum)
	{
		name = initName;
		jerseyNum = initNum;
		goals = 0;
		assists = 0;
		
	}
	
	
	public int getGoals()
	{
		return goals;
	}
	
	public void addGoals(int addGoal)
	{
		goals += addGoal;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getJerseyNum() {
		return jerseyNum;
	}



	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}






