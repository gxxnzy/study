package ch08.sec08.exam04;

public abstract class Animal {

	int age;
	String name;
	int leg;
	
	
	
	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public Animal(int age, int leg) {
		super();
		this.age = age;
		this.leg = leg;
	}


	abstract void printInfo();
	abstract void eat();
}
