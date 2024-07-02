package ch07.sec02;

import Ch05.sec06.Person;

public class PersonApp {

	public static void main(String[] args) {
		
		System.out.println("==== Person ====");
		Person p = new Person();
		p.setName("Kim");
		p.setAge(20);
		System.out.print("이름=" + p.getName());
		System.out.println(" | 나이=" + p.getAge());
		
		System.out.println("==== Student ====");
		Student s = new Student();
		s.setName("Lee");
		s.setAge(30);
		s.setHakbun("2023-001");
		System.out.print("이름=" + s.getName());
		System.out.print(" | 나이=" + s.getAge());
		System.out.println(" | 학번=" + s.getHakbun());
		
		System.out.println("==== Teacher ====");
		Teacher t = new Teacher();
		t.setName("Honf");
		t.setAge(40);
		t.setLesson("music");
		System.out.print("이름=" + t.getName());
		System.out.print(" | 나이=" + t.getAge());
		System.out.println(" | 학번=" + t.getLesson());
	}

}
