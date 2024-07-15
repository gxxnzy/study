package ch18.sec11;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -4161533620175201802L;
	
	String id;
	String name;
	int age;
	String sex;
	
	public Person() {
		super();
	}

	
	public Person(String id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}



	public void printInfo() {
		System.out.printf("아이디=%s|이름=%s|나이=%d|%s\n",id,name,age,sex);
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

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}


	
	
	
}
