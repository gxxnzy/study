package Ch05.sec06;

public class User {

	String name;
	int age;
	double tall;
	char sex;
	boolean marriage;
	
	public User() {
		super();
	}

	public User(String name, int age, double tall, char sex, boolean marriage) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.sex = sex;
		this.marriage = marriage;
	}

	public void printInfo() {
		System.out.printf("이름=%s | 나이=%d | 키=%f | 성별=%c | 결혼여부=b", name,age,tall,sex,marriage);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(float tall) {
		this.tall = tall;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	
	
}
