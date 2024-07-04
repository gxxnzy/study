package ch07.sec10.exam05;

public abstract class Game {
	
	String id;
	String game;

	public Game(String id, String game) {
		super();
		this.id = id;
		this.game = game;
		login();
	}
	public abstract void connect();
	public abstract void play();

	public void login() {
		System.out.println("["+id+"] 로그인");
	}
}
