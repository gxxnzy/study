package ch07.sec09.exam03;

public class Wizard extends Character{

	public Wizard(String name) {
		super(name, "Wizard");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}
	
	@Override
	public void attack() {
		System.out.print("["+getName()+"/"+getType()+"]");
		System.out.println(" 원거리 공격");
	}
	

	
}
