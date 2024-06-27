package Ch06.sec06.exam01;

public class CoffeExample {

	public static void main(String[] args) {
		
		System.out.println("====Object1====");
		Coffee coffee1 = new Coffee();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setPrice(4000);
		coffee1.printInfo();
		
		System.out.println("====Object2====");
		Coffee coffee2 = new Coffee("카푸치노",5000);
		coffee2.printInfo();
	}

}
