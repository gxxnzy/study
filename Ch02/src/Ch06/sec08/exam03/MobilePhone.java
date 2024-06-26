package Ch06.sec08.exam03;

public class MobilePhone {

	private String company;
	private String name;
	private String os;
	private String color;
	private boolean pen;
	private int memory;
	private int storage;
	private int battery;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPen() {
		return pen;
	}
	public void setPen(boolean pen) {
		this.pen = pen;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	void printInfo() {

		System.out.println("회사:" + company );
		System.out.println("제품:" + name);
		System.out.println("운영체제:" + os);
		System.out.println("컬러:" + color );
		System.out.println("펜:" + pen);
		System.out.println("메모리:" + memory);
		System.out.println("스토리지:" + storage );
		System.out.println("배터리:" + battery);
		System.out.println("===============");
	}
	
}
