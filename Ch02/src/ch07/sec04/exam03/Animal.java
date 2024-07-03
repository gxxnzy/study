package ch07.sec04.exam03;

public class Animal {

	private String species;
	private String name;
	private int age;
	private char sex;
	
	public Animal(String species, String name, int age, char sex) {
		super();
		this.species = species;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
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

	public char getSex() {
		if(sex=='M') {
			return '남';
		}
		else {
			return '여';
		}
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public void printInfo() {
		System.out.println("동물="+species+" | 이름="+name+" | 나이="+age+" | 성별="+sex);
	}
	
	
}
