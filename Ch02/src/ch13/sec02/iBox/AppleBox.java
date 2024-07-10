package ch13.sec02.iBox;

public class AppleBox implements IBox<Apple>{

	Apple apple;
	
	@Override
	public Apple get() {
		return apple;
	}

	@Override
	public void set(Apple apple) {
		this.apple = apple;
		
	}
	
	

}
