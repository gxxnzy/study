package ch14.sec03.task;

public class ThreadApp2 {

	public static void main(String[] args) {
		System.out.println("==== main(): Start ====");
		
//		MyThread mt = new MyThread();
//		mt.start();
		
		Thread th = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<3000; i++) {
					System.out.print("-");
				}
			}
		};
		th.start();
		
		for(int i=0; i<3000; i++) {
			System.out.print("|");
		}
		
		System.out.println("\n==== main(): End ====");

	}

}
