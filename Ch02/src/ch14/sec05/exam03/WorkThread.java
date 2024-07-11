package ch14.sec05.exam03;

public class WorkThread extends Thread{

	public boolean work = true;
	public boolean work2 = true;
	
	public WorkThread(String name) {
		setName(name);
	}


	@Override
	public void run() {
		while(work2) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();
			}
			
		}
	}
	
	public void stop_running() {
		this.work2 = false;
	}
	
	
	
	
	
}
