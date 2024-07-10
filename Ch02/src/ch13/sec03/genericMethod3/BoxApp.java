package ch13.sec03.genericMethod3;

public class BoxApp {

	public static void main(String[] args) {
		Box<Integer, Double> integerDoubleBox = new Box<>();
		
		integerDoubleBox.printInfoGeneric("hello", "world");
		integerDoubleBox.printInfoGeneric(10, 20);
		integerDoubleBox.printInfoGeneric("hello", 20);
	}
}
