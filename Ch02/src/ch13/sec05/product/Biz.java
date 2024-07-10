package ch13.sec05.product;

public class Biz {

	public static <T extends Fashion> void something(T t) {
		t.printInfo();
	}
}
