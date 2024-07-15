package Ch04.sec05;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -4161533620175201802L;
	
	String name;
	int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("이름=%s |나이=%d\n",name,age);
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
