package ch14.sec03.task;

public class ThreadApp {

	public static void main(String[] args) {
		System.out.println("==== main(): Start ====");
		
		MyRunnable myRun = new MyRunnable();
		Thread th = new Thread(myRun);
		th.start();
		
		for(int i=0; i<3000; i++) {
			System.out.print("|");
		}
		
		System.out.println("\n==== main(): End ====");

	}

}
