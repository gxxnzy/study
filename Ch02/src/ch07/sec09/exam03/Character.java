package ch07.sec09.exam03;

public class Character {

	private String name;
	private String type;
	
	public Character(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void printInfo() {
		System.out.println("이름="+name+" | 캐릭터="+type);
	}
	
	public void attack() {
		System.out.println("공격");
	}
	
}
