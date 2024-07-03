package ch07.sec04;

public class Teacher extends Person {

	private String lesson;

	public Teacher() {
	}

	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	@Override
	public void printInfo() {
		String name = super.getName();
		int age = super.getAge();
		
		System.out.println("이름="+name+" | 나이="+age+" | 과목="+lesson);
	}

}
