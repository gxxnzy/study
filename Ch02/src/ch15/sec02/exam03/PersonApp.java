package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Paige", 20));
		personList.add(new Person("Smith", 25));
		personList.add(new Person("Talyer", 30));
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			person.printInfo();
		}
	}
}
