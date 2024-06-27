package Ch06.sec06.exam04;

public class CarExample {

	public static void main(String[] args) {
		
		CarRefactor car2 = new CarRefactor("자가용");
		System.out.println("Car1.company: "+car2.company);
		System.out.println("Car1.model: "+car2.model);
		System.out.println();
		
		CarRefactor car3 = new CarRefactor("자가용","빨강");
		System.out.println("Car1.company: "+car3.company);
		System.out.println("Car1.model: "+car3.model);
		System.out.println("Car1.color: "+car3.color);
		System.out.println();

		CarRefactor car4 = new CarRefactor("자가용","빨강",200);
		System.out.println("Car1.company: "+car4.company);
		System.out.println("Car1.model: "+car4.model);
		System.out.println("Car1.color: "+car4.color);
		System.out.println("Car1.maxSpeed: "+car4.maxSpeed);		
		System.out.println();

	}

}
