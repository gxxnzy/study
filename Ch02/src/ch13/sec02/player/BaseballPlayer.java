package ch13.sec02.player;

public class BaseballPlayer extends Baseball implements Player<Baseball>{
	
	Baseball baseball;

	@Override
	public void set(Baseball t) {
		this.baseball = t;
		
	}

	@Override
	public Baseball get() {
		return baseball;
	}
	
	

}
