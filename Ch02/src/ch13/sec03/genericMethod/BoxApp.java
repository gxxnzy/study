package ch13.sec03.genericMethod;

public class BoxApp {

	public static void main(String[] args) {
		
		Box<Integer> integerBox = new Box<>();
		
		integerBox.printInfo(Integer.valueOf(10));
		integerBox.printInfo(20);
		
		integerBox.printInfoGeneric(new Person("James",30));
		integerBox.printInfoGeneric(new String("Hello"));
	}

}
