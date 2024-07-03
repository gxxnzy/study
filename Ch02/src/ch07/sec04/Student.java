package ch07.sec04;

public class Student extends Person {

	private String hakbun;

	public Student() {
	}

	public Student(String name, int age, String hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	@Override
	public void printInfo() {
//		String name = super.getName();
//		int age = super.getAge();
//		
//		System.out.println("이름="+name+" | 나이="+age+" | 학번="+hakbun);

		System.out.print("이름="+ getName());
		System.out.print(" | 나이="+ getAge());
		System.out.print(" | 학번="+ hakbun);
		
	}

	
}