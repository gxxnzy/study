package Ch06.sec10.exam03;

public class CarApp {

	public static void main(String[] args) {
		Car.simulate();
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}

}
