package Ch05.sec11;

public class Menu {

	String name;
	int price;
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("메뉴="+name+" | 가격="+DecimalUtil.decimalComma(price));
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
	
	
}
