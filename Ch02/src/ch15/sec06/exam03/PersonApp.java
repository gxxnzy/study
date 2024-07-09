package ch15.sec06.exam03;

import java.util.HashMap;
import java.util.Map;

public class PersonApp {

	public static void main(String[] args) {

		System.out.println("==== 클래스 ====");
		Person p = new Person("Kim",20);
		p.printInfo();
		
		Person s = new Student("Smith",25,"2024-001");
		s.printInfo();
		
		Person t = new Teacher("Tom",30,"Music");
		t.printInfo();
		
		System.out.println("\n==== Map ====");
		Map<String, Person> personMap = new HashMap<String, Person>();
		
		personMap.put("s1", s);
		personMap.put("s2", new Student("Susan",28,"2024-002"));
		personMap.put("t1", t);
		personMap.put("t2", new Student("Tiffany",32,"Art"));
		
		PrintMap pm = new PrintMap(personMap);
		pm.printPersonMap();
		
	}

}
