package ch11.sec03.exam01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("==== Object 1 ====");  
			String string1 = "Hello";                  
			System.out.println(Integer.parseInt(string1));
			
			System.out.println("==== Object 2 ====");
			String string2 = "World";
			System.out.println(Integer.parseInt(string2));
		} catch(NumberFormatException e) {
			System.out.println("==== catch ====");
		} finally {
			System.out.println("==== finally ====");
			
		}
		
	}

}
