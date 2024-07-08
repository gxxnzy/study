package ch15.sec02.exam04;

public class Menu {
	private String menu;
	private int price;
	
	public Menu(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	
	
	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void printInfo() {
		System.out.println("메뉴="+menu+" | 가격="+price);
	}
}
