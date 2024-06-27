package Ch06.sec06.exam04;

public class CarRefactor {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	CarRefactor(String model){
		this(model,"은색",250);
	}
	
	CarRefactor(String model,String color){
		this(model,color,250);
	}
	
	CarRefactor(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
