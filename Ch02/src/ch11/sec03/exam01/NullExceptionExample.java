package ch11.sec03.exam01;

import ch15.sec02.exam03.Person;

public class NullExceptionExample {

	public static void main(String[] args) {
		Person p = null;
		try {
			String name = p.getName();
			System.out.println("이름 :" + name);
		} catch(NullPointerException e) {
			System.out.println("==== catch ====");
		} finally {
			System.out.println("==== finally ====");			
		}
	}
		

}
