package ch13.sec02.player;

public interface Player<T> {

	public void set(T t);
	
	public T get();
}
