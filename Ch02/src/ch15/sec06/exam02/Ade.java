package ch15.sec06.exam02;

public class Ade extends Menu{
	private String ingredient;

	public Ade(String menu, int price,String ingredient) {
		super(menu, price);
		this.ingredient = ingredient;
	}


	@Override
	public void printInfo() {
		System.out.print("메뉴="+getMenu());
		System.out.print(" | 가격="+getPrice());
		System.out.println(" | 재료="+ingredient);
	}
}
