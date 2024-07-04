package ch08.sec08.exam03;

public class Sedan extends Car implements PassengerModel {

	
	public Sedan(String name) {
		super(name);
	}

	@Override
	public void getOn() {
		System.out.println(name+"에 타다.");
		
	}

	@Override
	public void getOff() {
		System.out.println(name+"에 타다.");
		
	}

	
}
