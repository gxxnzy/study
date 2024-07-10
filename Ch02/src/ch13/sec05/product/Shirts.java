package ch13.sec05.product;

public class Shirts extends Fashion{

	String size;
	String as;
	
	public Shirts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shirts(String name, int price, String size, String as) {
		super(name, price);
		this.size = size;
		this.as = as;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("크기="+size+" | A/S="+as);
	}
	
	
	
}
