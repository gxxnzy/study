package ch16.sec05.say;

public class App {

	public static void main(String[] args) {
		System.out.println("==== Anonymous ====");
		ISayable sayable0 = new ISayable() {
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		sayable0.sayHello();
		
		System.out.println("\n==== Lambda ====");
		System.out.println("---- Type 1 ----");
		ISayable sayable1 = () -> {
			System.out.println("Welcome");
		};
		sayable1.sayHello();

		System.out.println("\n---- Type 2 ----");
		ISayable sayable2 = () -> French.greeting();;
		sayable2.sayHello();
		
		System.out.println("\n---- Type 3 ----");
		ISayable sayable3 = French :: greeting;
		sayable3.sayHello();
	}

}
