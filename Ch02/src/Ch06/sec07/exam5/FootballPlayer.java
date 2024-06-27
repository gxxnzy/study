package Ch06.sec07.exam5;

public class FootballPlayer {
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;

	FootballPlayer(){}
	
	FootballPlayer(String name,String teamName,String uniformNumber,int speed,int tech){
		this.name = name;
		this.teamName = teamName;
		this.uniformNumber = uniformNumber;
		this.speed = speed;
		this.tech = tech;
	}
	
	void printInfo() {
		System.out.println("선수: "+name);
		System.out.println("팀: "+teamName);
		System.out.println("백넘버: "+uniformNumber);
		System.out.println("속도: "+speed);
		System.out.println("기술: "+tech);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniformNumber() {
		return uniformNumber;
	}

	public void setUniformNumber(String uniformNumber) {
		this.uniformNumber = uniformNumber;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}
	
	
}
