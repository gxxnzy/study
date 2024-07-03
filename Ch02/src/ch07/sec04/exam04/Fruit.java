package ch07.sec04.exam04;

public class Fruit extends Product{
	
	String packaging;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String name, int price, String packaging) {
		super(name, price);
		this.packaging = packaging;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("포장타입="+packaging);
	}
	
}
