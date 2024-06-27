package Ch06.sec10.exam02;

public class CalculatorStatic {
	
	int a;
	int b;
	
	public CalculatorStatic(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void plus() {
		System.out.println("plus()::"+a+" + "+b+" = "+(a+b));

	}
	void minus() {
		System.out.println("minus()::"+a+" - "+b+" = "+(a-b));
	}
	void multiply() {
		System.out.println("multiply()::"+a+" * "+b+" = "+(a*b));
	}
	void divide() {
		System.out.println("divide()::"+a+" / "+b+" = "+(a/b));
	}
	void rest() {
		System.out.println("rest()::"+a+" % "+b+" = "+(a%b));
	}
	
	void printInfo(){
		System.out.println("값1="+a+"값2="+b);
	}

	public void clear() {
		a=0;
		b=0;
		System.out.println("필드 초기화 완료");
		
	}
}
