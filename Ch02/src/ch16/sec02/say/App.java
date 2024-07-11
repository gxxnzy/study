package ch16.sec02.say;

public class App {

	public static void main(String[] args) {
		System.out.println("==== Annonymous ====");
		ISayable sayable0 = new ISayable() {
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		sayable0.sayHello();
		
		System.out.println("\n==== Lambda ====");
		System.out.println("---- Type 1. ----");
		

		ISayable sayable1 = () -> {
			System.out.println("Hello");
		};
		sayable1.sayHello();
		
	}
}
