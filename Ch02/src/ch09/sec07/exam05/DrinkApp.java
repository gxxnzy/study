package ch09.sec07.exam05;

public class DrinkApp {

	public static void main(String[] args) {
		
		System.out.println("==== Variable ====");
		System.out.println("---- implemetns Interface ----");
		Drink beer = new Beer();
		beer.drink();

		Drink water = new Water();
		water.drink();
		
		System.out.println("\n---- Anonymous Object ----");
		Drink beer1 = new Drink() {
			@Override
			public void drink() {
				System.out.println("맥주를 마시다.");
			}
		};
		beer1.drink();
		
		Drink water1 = new Drink() {
			@Override
			public void drink() {
				System.out.println("물을 마시다.");
			}
		};
		water1.drink();
		
		System.out.println("==== Method ====");
		System.out.println("---- implemetns Interface ----");
		
		Biz b = new Biz();
		b.biz(beer);
		b.biz(water);
		
		System.out.println("\n---- Anonymous Object ----");
		b.biz(new Drink() {
			@Override
			public void drink() {
				System.out.println("와인을 마시다.");
			}
		});
		
		b.biz(new Drink() {
			@Override
			public void drink() {
				System.out.println("커피를 마시다.");
			}
		});
	}

}
