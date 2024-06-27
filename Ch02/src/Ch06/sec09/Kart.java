package Ch06.sec09;

public class Kart {

	String name;
	String color;
	int upSpeed = 40;
	int downSpeed = 80;
	int maxSpeed = 150;
	int boosterUpSpeed = 100;
	int maxPickupBooster = 1;
	
	int speed = 0;
	int booster = 0;
	
	public Kart(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	void printKartInfo() {
		System.out.println("카트명="+ name);
		System.out.println("카트 컬러="+ color);
		System.out.println("속도 Up 호출 시 증가 속도: "+ upSpeed +"(km)");
		System.out.println("속도 Down 호출 시 감소 속도:"+ downSpeed +"(km)");
		System.out.println("최대 속도: "+ maxSpeed +"(km)");
		System.out.println("부스터 사용시 증가 속도: "+ boosterUpSpeed +"(km)");
		System.out.println("부스터 최대 보유 개수: "+ maxPickupBooster +"(개)");
	}

	
	void printRunInfo(String type) {
		System.out.println("[" +name+ "(" +color+ ")]" + type + "| 속도:" +speed+ "(km)| 부스터:" +booster+ "(개)");

	}
	void printRunInfo(String type,String detail) {
		System.out.println("[" +name+ "(" +color+ ")]" + type + "| 속도:" +speed+ "(km)| 부스터:" +booster+ "(개)|"+detail);

	}
	
	public void pickupBooster() {
		if(booster>=1) {
			booster=1;
			printRunInfo("pickUpBooster","부스터를 더 이상 추가할 수 없습니다.");
		}else {
			booster+=1;
			printRunInfo("pickUpBooster");
		}

	}

	public void speedUp() {
		speed += upSpeed;
		speed = speedIntegrity(speed);
		printRunInfo("speedUp");
		
	}

	public void useBooster() {
		if (booster<=0) {
			booster=0;
			printRunInfo("userBooster","사용 가능한 부스터가 없습니다.");
		}else {
			booster-=1;
			speed += boosterUpSpeed;
			speed = speedIntegrity(speed);
			printRunInfo("userBooster");
		}
		
	}

	public void speedDown() {
		speed -= downSpeed;
		speed = speedIntegrity(speed);
		printRunInfo("speedDown");
		
	}
	
	private int speedIntegrity(int speed) {
		if(speed>150)
			speed=150;
		else if(speed<0)
			speed=0;
		return speed;
	}
}
