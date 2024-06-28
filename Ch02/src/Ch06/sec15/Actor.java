package Ch06.sec15;

public class Actor {

	private String name;
	private String sex;
	private String birthdate;
	private String nation;
	
	public Actor(String name, String sex, String birthdate, String nation) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.nation = nation;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		System.out.println("성별=" + sex);
		System.out.println("생년월일=" + birthdate);
		System.out.println("국적=" + nation);

	}
	
}
