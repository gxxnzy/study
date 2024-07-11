package ch14.sec06.time;

public class App {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("["+DateTimeUtil.getLocalDateTimeDash()+"] 1초");
					try {
						Thread.sleep(1000);
					} catch(Exception e) {}
				}
			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("["+DateTimeUtil.getLocalDateTimeDash()+"] @@10초@@");
					try {
						Thread.sleep(10000);
					} catch(Exception e) {}
				}
			}
		});
		thread2.start();;
	}

}
