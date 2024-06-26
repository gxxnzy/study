package Ch06.sec06.exam01;

public class Coffee {
	
	String coffeeType = "에스프레소";
	int price = 3000;
	String requirement = "샷추가";
	
	void printInfo() {
		System.out.println("커피=" + coffeeType);
		System.out.println("가격=" + price);
		System.out.println("요구사항=" + requirement);
	}

	public String getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
}
