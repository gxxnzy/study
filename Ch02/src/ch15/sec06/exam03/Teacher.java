package ch15.sec06.exam03;

public class Teacher extends Person {
	
	private String lesson;

	
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
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.println(" | 과목=" + lesson);
	}
	
	
}
