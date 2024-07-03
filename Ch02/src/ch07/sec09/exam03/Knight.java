package ch07.sec09.exam03;

public class Knight extends Character{

	public Knight(String name) {
		super(name, "Knight");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.print("["+getName()+"/"+getType()+"]");
		System.out.println(" 원거리 공격");
	}
	
}
