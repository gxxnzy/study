package ch13.sec02.iBox2;

public class BoxApp {

	public static void main(String[] args) {
		System.out.println("==== Box<Apple> ====");
		Box<Apple> appleBox = new Box<>();
		appleBox.set(new Apple());
		appleBox.get().printInfo();
		
		System.out.println("\n==== Box<Banana> ====");
		Box<Banana> bananaBox = new Box<>();
		bananaBox.set(new Banana());
		bananaBox.get().printInfo();
	}

}
