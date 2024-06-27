package Ch06.sec09;

public class CalculatorConstructor {

	int a;
	int b;
	int plus;
	int minus;
	int multiply;
	int divide;
	int rest;
	
	public CalculatorConstructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void plus() {
		plus = a+b;
	}
	void minus() {
		minus = a-b;
	}
	void multiply() {
		multiply = a*b;
	}
	void divide() {
		divide = a/b;
	}
	void rest() {
		rest = a%b;
	}
	
	void printInfo(){
		System.out.println("plus()::"+a+" + "+b+" = "+plus);
		System.out.println("minus()::"+a+" - "+b+" = "+minus);
		System.out.println("multiply()::"+a+" * "+b+" = "+multiply);
		System.out.println("divide()::"+a+" / "+b+" = "+divide);
		System.out.println("rest()::"+a+" % "+b+" = "+rest);
	}

	public void clear() {
		plus = 0;
		minus = 0;
		multiply = 0;
		divide = 0;
		rest = 0;
		
	}
	
}
