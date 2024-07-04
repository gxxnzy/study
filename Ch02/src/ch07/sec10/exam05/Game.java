package ch07.sec10.exam05;

public abstract class Game {
	
	String id;

	public Game(String id) {
		super();
		this.id = id;
	}
	public abstract void connect();
	public abstract void play();
	
}
