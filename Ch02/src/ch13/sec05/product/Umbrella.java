package ch13.sec05.product;

public class Umbrella extends Fashion{

	int height;
	String as;
	
	public Umbrella() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Umbrella(String name, int price,int height, String as) {
		super(name, price);
		this.height = height;
		this.as = as;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("무게="+height+"(g) | A/S="+as);
	}
	
}
