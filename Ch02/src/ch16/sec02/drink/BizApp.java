package ch16.sec02.drink;

public class BizApp {

	public static void main(String[] args) {
		
		System.out.println("==== Implements Interface");
		Biz b = new Biz();
		IDrink beer = new Beer();
		IDrink water = new Water();
		
		b.biz(beer);
		b.biz(water);
		
		System.out.println("\n==== Anonymous ====");
		b.biz( new Beer() {
			@Override
			public void drink() {
				System.out.println("맥주를 마시다.");
			}
		});
		b.biz( new Water() {
			@Override
			public void drink() {
				System.out.println("물을 마시다.");
			}
		});
		
		System.out.println("\n==== Lambda ====");
		b.biz(() -> System.out.println("맥주를 마시다."));
		b.biz(() -> System.out.println("물을 마시다."));
		b.biz(() -> System.out.println("와인을 마시다."));
		b.biz(() -> System.out.println("커피를 마시다."));

	}

}
