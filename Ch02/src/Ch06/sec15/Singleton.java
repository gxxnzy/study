package Ch06.sec15;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("ㅎㅇ");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
