package ch07.sec04.exam04;

public class Shirts extends Fashion{

	char size;
	String as;
	
	public Shirts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shirts(String name, int price, char size, String as) {
		super(name, price);
		this.size = size;
		this.as = as;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("크기="+size+" | A/S="+as);
	}
	
	
	
}
