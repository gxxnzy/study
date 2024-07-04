package ch08.sec08.exam04;

public class SuperMan extends Human implements Flyer{

	public SuperMan(int age, String name) {
		super(age, name);
	}

	
	@Override
	void eat() {
		System.out.println("SuperMan.eat()");
	}


	@Override
	public void takeOff() {		
		System.out.println("SuperMan.takeOff()");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan.fly()");
		
	}

	@Override
	public void land() {
		System.out.println("SuperMan.land()");
		
	}

	
}
