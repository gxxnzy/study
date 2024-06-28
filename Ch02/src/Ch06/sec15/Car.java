package Ch06.sec15;

public class Car {
	String model;
	String color;
	String type;
	Company company;
	
	public Car(String model, String color, String type, Company company) {
		super();
		this.model = model;
		this.color = color;
		this.type = type;
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("모뎅="+model+" | 색상="+color+" | 타입="+type);
		
		company.printInfo();
	}

	
	
}
