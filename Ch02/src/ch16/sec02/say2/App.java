package ch16.sec02.say2;

public class App {
	public static void main(String[] args) {
		Biz biz = new Biz();
		
		System.out.println("==== Lambda ====");
		System.out.println("---- Type 1. ----");
		biz.work(() -> {
			System.out.println("Hello");
		});
		
		System.out.println("---- Type 2. ----");
		biz.work(() -> System.out.println("Hello"));
		
		System.out.println("---- Type 3. ----");
		biz.work(() -> {
			System.out.println("Hello");
			System.out.println("Welcome");		
		});
		
		System.out.println("==== Anonymous ====");
		biz.work(new ISayable() {
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		});
		
	}
}
