package ch07.sec09.exam05;

public class MenuService {

	public static Coffee makeCoffee(String menu, int price,String beans) {
		Coffee coffee;
		coffee = new Coffee(menu,price,beans);
		return coffee;
	}
	
	public static Ade makeAde(String menu, int price,String ingredient) {
		Ade ade;
		ade = new Ade(menu,price,ingredient);
		return ade;
	}
}
