package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(5000); 
		workThreadA.stop_running();
		workThreadB.stop_running();} catch (InterruptedException e) {}
		workThreadA.work = false;
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadB.work = true;
		
		
	}

}
