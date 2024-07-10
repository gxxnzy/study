package ch11.sec03.exam01;

public class StringExceptionExample {

	public static void main(String[] args) {

		System.out.println("==== Object 1 ====");
		String string1 = "Hello";
		System.out.println(string1.charAt(1));
		
		System.out.println("==== Object 2 ====");
		try {
			String string2 = "";
			System.out.println(string2.charAt(1));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("==== catch ====");
		} finally {
			System.out.println("==== finally ====");			
		}
		
	}

}
