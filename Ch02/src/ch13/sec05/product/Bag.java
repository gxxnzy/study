package ch13.sec05.product;

public class Bag<T extends Product> {

	private T kind;

	public Bag(T kind) {
		super();
		this.kind = kind;
	}
	
	public void printInfo() {
		kind.printInfo();
	}
	
}
