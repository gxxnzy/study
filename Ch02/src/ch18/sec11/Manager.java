package ch18.sec11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	
	List<Person> personList = new ArrayList<>();

	public void printPersonList() {

		for(int i=0;i<personList.size();i++) {
			Person person = personList.get(i);
			person.printInfo();
		}
		if(personList.size()==0) {
			System.out.println("등록된 Person 정보가 없습니다.");
		}
		
	}

	public void addPerson(Scanner sc) {

		System.out.println("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요 =>");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 =>");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요: F(여자) M(남자)=>");
		String sex = sc.nextLine();
		
		personList.add(new Person(id,name,age,sex));
	}

	public void updatePerson(Scanner sc) {

		System.out.println("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요 =>");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 =>");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요: F(여자) M(남자)=>");
		String sex = sc.nextLine();
		
		for(int i=0;i<personList.size();i++) {
			Person person = personList.get(i);
			if(person.getId().equals(id)) {
				person.setName(name);
				person.setAge(age);
				person.setSex(sex);
			}
		}
		
	}

	public void deletePerson(Scanner sc) {
		System.out.println("ID를 입력하세요 =>");
		String id = sc.nextLine();
		
		for(int i=0;i<personList.size();i++) {
			Person person = personList.get(i);
			if(person.getId().equals(id)) {
				personList.remove(person);
			}
		}
		
	}

	public void selectPersonBySex(Scanner sc) {
		System.out.println("성별을 입력하세요. 값:F(여자)M(남자) =>");
		String sex = sc.nextLine();
		personList.stream().filter(n-> n.getSex().equals(sex)).forEach(n-> n.printInfo());
		
	}

	public void selectPersonBetweenAge(Scanner sc) {
		
		System.out.println("시작 나이를 입력하세요 =>");
		int startAge = sc.nextInt();
		sc.nextLine();
		System.out.println("종료 나이를 입력하세요 =>");
		int endAge = sc.nextInt();
		sc.nextLine();
		if(startAge > endAge) {
			System.out.println("시작 나이는 종료 나이보다 작거나 같아야 합니다.");
		} else {
			personList.stream().filter(n-> n.getAge()>=startAge && n.getAge()<=endAge).forEach(n-> n.printInfo());
		}
	}
		
		

}
