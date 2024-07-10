package ch13.sec02.iBox2;

public class Box<T> implements IBox<T> {

	T t;

	@Override
	public void set(T t) {
		this.t = t;
		
	}

	@Override
	public T get() {
		return t;
	}
	
	
}
