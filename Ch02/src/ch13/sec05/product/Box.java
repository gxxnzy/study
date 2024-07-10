package ch13.sec05.product;

public class Box<T extends Fashion>{
	
	private T kind;

	public Box(T kind) {
		super();
		this.kind = kind;
	}


	public void printInfo() {
		kind.printInfo();
	}
	

}
