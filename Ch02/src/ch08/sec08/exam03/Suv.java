package ch08.sec08.exam03;

public class Suv extends Car implements PassengerModel, TruckModel{

	public Suv(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println(name+"에서 짐을 싣다.");
		
	}

	@Override
	public void unload() {
		System.out.println(name+"에서 짐을 내리다.");
		
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
