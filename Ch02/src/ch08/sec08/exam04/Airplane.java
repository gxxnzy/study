package ch08.sec08.exam04;

public class Airplane implements Flyer, Transport {
	
	public Airplane() {
		super();
	}

	@Override
	public void load() {
		System.out.println("Airplane.load()");
	}

	@Override
	public void unload() {
		System.out.println("Airplane.unload()");

		
	}

	@Override
	public void takeOff() {
		System.out.println("Airplane.takeOff()");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane.fly()");
		
	}

	@Override
	public void land() {
		System.out.println("Airplane.land()");
		
	}
	
	

}
