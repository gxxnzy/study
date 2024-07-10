package ch13.sec02.player;

public class FootballPlayer extends Football implements Player<Football>{

	Football football;
	
	@Override
	public void set(Football t) {
		this.football = t;
		
	}

	@Override
	public Football get() {
		return football;
	}

	
}
