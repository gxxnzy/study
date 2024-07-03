package ch07.sec04.exam04;

public class Product {

	String name;
	int price;
	
	public Product() {
		super();
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("제품="+name+" | 가격="+price);
	}
	
}
