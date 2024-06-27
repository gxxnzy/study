package Ch06.sec08.exam05;

public class UserApp {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("\n==== printInfo() ====");
		user.printInfo();
		
		String name = "Lee";
		int age = 20;
		float height = 180.5f;
		char sex = 'M';
		boolean marriageYn = true;
		User user2 = new User(name,age,height,sex,marriageYn);
		System.out.println("\n==== printInfo() ====");
		user2.printInfo();
	}

}
