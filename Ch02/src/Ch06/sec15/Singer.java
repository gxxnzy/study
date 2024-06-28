package Ch06.sec15;

public class Singer {
	String name;
	char sex;
	String birthDate;
	String companytS;
	
	public Singer(String name, char sex, String birthDate, String companytS) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.companytS = companytS;
	}
	
	public void printInfo() {
		System.out.print("이름="+name);
		System.out.print(" | 성별="+sex);
		System.out.print(" | 생년월일="+birthDate);
		System.out.print(" | 소속사="+companytS);
		System.out.println();


	}
}
