package Ch05.sec06;

public class PersonArrayAppMultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[][] personArray = new Person[2][];
		
		personArray[0] = new Person[1];
		personArray[1] = new Person[2];
		
		personArray[0][0] = new Person("Lee",30);
		
		personArray[1][0] = new Person("Hong",20);
		personArray[1][1] = new Person("Choi", 25);
		
		
		System.out.println("==== personArray[0] ====");
		System.out.println("빼열길이=" + personArray[0].length);
		for(int i=0; i<personArray[0].length; i++){
			personArray[0][i].printInfo();
		}
		
		System.out.println("==== personArray[1] ====");
		System.out.println("빼열길이=" + personArray[1].length);
		for(int i=0; i<personArray[1].length; i++){
			personArray[1][i].printInfo();

		}
		
		System.out.println("==== personArray ====");
		System.out.println("빼열길이=" + personArray.length);
		for(int i=0; i<personArray.length; i++){
			for(int j=0; j<personArray[i].length; j++) {
				personArray[i][j].printInfo();

			}
		}
		
		
	}

}
