package ch13.sec02.iBox;

public class BananaBox implements IBox<Banana>{

	Banana banana;

	@Override
	public Banana get() {
		return banana;
	}

	@Override
	public void set(Banana banana) {
		this.banana = banana;
		
	}
	
	
}
