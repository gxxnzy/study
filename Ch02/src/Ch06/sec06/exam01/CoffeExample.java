package Ch06.sec06.exam01;

public class CoffeExample {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();

		System.out.println("====초기값====");
		c1.printInfo();
		
		c1.setCoffeeType("아메리카노");
		c1.setPrice(2000);
		c1.setRequirement("샷추가, 아이스");
		
		System.out.println();
		System.out.println("====값 변경====");
		c1.printInfo();
	}

}
