package ch11.sec05.exam01;

public class Control {

	public void method() throws ArrayIndexOutOfBoundsException{
		System.out.println("\tControl.method()::Start");
		
		Service s = new Service();
		s.method();
		
//		try {
//			s.method();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("\t----catch: Service.method() ----");
//		} finally {
//			System.out.println("\t----finally: Service.method() ----");				
//
//		}
		
		System.out.println("\tControl.method()::End");
	}

}
