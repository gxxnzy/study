package ch08.sec08.exam04;

public class Human extends Animal{

	public Human(int age, String name) {
		super(age, name);
	}

	@Override
	void eat() {
		System.out.println("Human.eat()");
	}

	@Override
	void printInfo() {
		System.out.println("나이="+age+" : 이름="+name);
		
	}

	
}
