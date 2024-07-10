package ch13.sec05.product;

public class DriedFruit extends Fruit{

	String packaging;

	public DriedFruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public DriedFruit(String name, int price) {
		super(name, price, "상온(종이포장)");
	}


	public DriedFruit(String name, int price, String packaging) {
		super(name, price, packaging);
	}
	
	
}
