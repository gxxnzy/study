package ch14.sec03.task;

public class App {

	public static void main(String[] args) {
		System.out.println("==== main(): Start ====");
		
		Task task = new Task();
		task.biz();
		
		for(int i=0; i<3000; i++) {
			System.out.print("|");
		}
		
		System.out.println("\n==== main(): End ====");
	}

}
