package Ch06.sec09;

public class Calculator {

	void plus(int a, int b) {
		System.out.println("plus()::"+a+" + "+b+" = "+(a+b));
	}
	void minus(int a, int b) {
		System.out.println("minus()::"+a+" - "+b+" = "+(a-b));
	}
	void multiply(int a, int b) {
		System.out.println("multiply()::"+a+" * "+b+" = "+(a*b));
	}
	void divide(int a, int b) {
		System.out.println("divide()::"+a+" / "+b+" = "+(a/b));
	}
	void rest(int a, int b) {
		System.out.println("rest()::"+a+" % "+b+" = "+(a%b));
	}
}
