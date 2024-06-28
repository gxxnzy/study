package Ch05.sec06;

public class PersonArrayApp {

	public static void main(String[] args) {
		
		Person[] personArray;
		
		personArray = new Person[3];
		
		personArray[0] = new Person();
		personArray[0].setName("Hong");
		personArray[0].setAge(25);
		
		personArray[1] = new Person("Lee",40);
		
		Person p = new Person("Park",35);
		personArray[2] = p;
		
		for(int i=0;i<personArray.length;i++) {
			personArray[i].printInfo();
		}
		

	}

}
