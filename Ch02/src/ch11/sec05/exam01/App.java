package ch11.sec05.exam01;

public class App {

	public static void main(String args[]) {
		System.out.println("App.main()::Start");
		
		Control c = new Control();
		try {
			c.method();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("----catch: Service.method() ----");
		} finally {
			System.out.println("----finally: Service.method() ----");	
		}

		
		System.out.println("App.main()::End");

	}

}