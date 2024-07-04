package ch08.sec08.exam03;

public class Truck extends Car implements TruckModel{

	
	public Truck(String name) {
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

	
}
