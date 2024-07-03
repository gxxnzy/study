package ch07.sec09.exam03;

public class Archer extends Character{

	public Archer(String name) {
		super(name, "Archer");
	}

	@Override
	public void attack() {
		System.out.print("["+getName()+"/"+getType()+"]");
		System.out.println(" 원거리 공격");
	}

	
	
}
