package Ch06.sec10.exam02;

public class CalculatorStaticExample {

	public static void main(String[] args) {
		CalculatorStatic cal = new CalculatorStatic(10,6);
		
		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();

		System.out.println("\n==== printInfo() ====");
		cal.printInfo();
		
		System.out.println("\n==== clear() ====");
		cal.clear();
		
		System.out.println("\n==== printInfo() ====");

		cal.printInfo();

	}

}
