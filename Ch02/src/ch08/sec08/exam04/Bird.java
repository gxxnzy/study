package ch08.sec08.exam04;

public class Bird extends Animal implements Flyer{

	public Bird(int age, int leg) {
		super(age, leg);
	}

	@Override
	void printInfo() {
		System.out.println("나이="+age+" : 날개수="+leg);
		
	}

	@Override
	void eat() {
		System.out.println("Bird.eat()");
		
	}

	@Override
	public void takeOff() {
		System.out.println("Brid.takeOff()");
		
	}

	@Override
	public void fly() {
		System.out.println("Brid.fly()");
		
	}

	@Override
	public void land() {
		System.out.println("Brid.land()");
		
	}
	
	
	

}
