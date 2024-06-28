package Ch05.sec06;

public class UserArrayApp {

	public static void main(String[] args) {
		
		User[] userArray;
		userArray = new User[3];
		
		userArray[0] = new User("James",25,182.5,'M',true);
		userArray[1] = new User("Sophia",30,178.2,'F',false);
		userArray[2] = new User("Archer",35,175.3,'M',false);
		
		for(int i=0;i<userArray.length;i++) {			
			System.out.print("userArray["+i+"] ");
			userArray[i].printInfo();
			System.out.println();
		}
		

	}

}
