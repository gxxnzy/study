package ch17.sec05.streamPerson;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("==== List<Person> ====");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige",20));
		list.add(new Person("James",30));
		list.add(new Person("Smith",40));
		list.add(new Person("Tom",50));
		list.add(new Person("Victoria",60));
		for(Person p:list) {
			p.printInfo();
		}
		
		System.out.println("\n==== 이름: James ====");
		list.stream().filter(n->n.getName()=="James").forEach(n -> n.printInfo());
		
		System.out.println("\n==== 나이: 50세 이상 ====");
		list.stream().filter(n->n.getAge()>=50).forEach(n -> n.printInfo());
		
		System.out.println("\n==== 이름에 a가 있고, 나이가 30세 미만 ====");
		list.stream().filter(n->n.getAge()<30 & n.getName().contains("a")).forEach(n -> n.printInfo());
	}

}
