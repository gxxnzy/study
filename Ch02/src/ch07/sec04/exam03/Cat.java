package ch07.sec04.exam03;

public class Cat extends Animal{

	private int legs;
	
	public Cat( String name, int age, char sex,int legs) {
		super("고양이", name, age, sex);
		this.legs = legs;
	}
	
	public void printInfo() {
		System.out.print("동물="+getSpecies());
		System.out.print(" | 이름="+getName());
		System.out.print(" | 나이="+getAge());
		System.out.print(" | 성별="+getSex());
		System.out.println(" | 다리="+legs+"(개)");
		
	}
	public void sleep() {
		System.out.println("sleep() :: "+getName());
	}

	
}
