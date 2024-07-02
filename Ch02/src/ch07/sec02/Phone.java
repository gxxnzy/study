package ch07.sec02;

public class Phone {

	public String model;
	public String color;
	
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String Color) 생성자 실행");
	}

	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoid(String message) {
		System.out.println("자기: "+message);
	}
	
	public void receiveVoid(String message) {
		System.out.println("상대방: "+message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
