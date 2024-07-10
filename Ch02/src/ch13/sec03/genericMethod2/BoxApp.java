package ch13.sec03.genericMethod2;

import ch15.sec02.exam03.Person;

public class BoxApp {

	public static void main(String[] args) {
		Box<Person> stringBox = new Box<>();
		
		stringBox.printInfoGeneric("hello", "world");
		stringBox.printInfoGeneric(10, 20);
		stringBox.printInfoGeneric("hello", 20);
	}

}
