package ch11.sec03.exam01;

public class TryCatchApp {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		try {
			int result = a/b;
			System.out.println("result=" + result);
		} catch(ArithmeticException e) {
			System.out.println("---- catch ----");
		} finally {
			System.out.println("---- finally ----");
		}
	}

}
