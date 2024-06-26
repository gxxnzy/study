package Ch06.sec08.exam03;

public class SunCream {
	private String company;
	private String name;
	private boolean stickiness;
	private char skinType;
	private int capacity;
	private int spf;
	private String pa;
	
	private String printstickiness;
	
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
	public boolean isStickiness() {
		return stickiness;
	}
	public void setStickiness(boolean stickiness) {

		this.stickiness = stickiness;
		if (stickiness==true) {
			printstickiness = "있음";
		}else {
			printstickiness = "없음";
		}
	}
	public char getSkinType() {
		return skinType;
	}
	public void setSkinType(char skinType) {
		this.skinType = skinType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSpf() {
		return spf;
	}
	public void setSpf(int spf) {
		this.spf = spf;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	void printInfo() {

		System.out.println("회사:" + company );
		System.out.println("제품:" + name);
		System.out.println("끈적임 "+printstickiness);

		if (skinType=='o') {
			System.out.println("피부타입: 지성피부군");

		}else if (skinType=='d') {
			System.out.println("피부타입: 건성피부군");

		}else if (skinType=='s') {
			System.out.println("피부타입: 민감성");

		}else if (skinType=='r') {
			System.out.println("피부타입: 저항성");

		}else {
			System.out.println("피부타입 없음");
		}
		System.out.println("용량:" + capacity + "(ml)");
		System.out.println("SPF:" + spf);
		System.out.println("PA:" + pa );
	}
	
}
