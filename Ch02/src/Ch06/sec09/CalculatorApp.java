package Ch06.sec09;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorConstructor cal = new CalculatorConstructor(10,6);
				
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
