package Ch06.sec08.exam05;

public class User {

    private String name = "Oliviia"; // 이름, 명시적 초기화
    private int age = 30; // 나이, 명시적 초기화
    private float height; // 키
    private char sex; // 성별. F 여성, M 남성
    private boolean marriageYn; // 결혼여부

    User(){}
    
    public User(String name, int age, float height, char sex, boolean marriageYn) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.marriageYn = marriageYn;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean getMarriageYn() {
        return marriageYn;
    }

    public void setMarriageYn(boolean marriageYn) {
        this.marriageYn = marriageYn;
    }

    public void printInfo() {
        System.out.println("이름=" + name);
        System.out.println("나이=" + age);
        System.out.println("키=" + height);
        System.out.println("성별=" + sex);
        System.out.println("결혼여부=" + marriageYn);
    }

}
