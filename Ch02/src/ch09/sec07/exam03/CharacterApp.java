package ch09.sec07.exam03;

public class CharacterApp {

	public static void main(String[] args) {
		
		System.out.println("==== Anonymous Object ====");
		System.out.println("----1----");
		Character c1 = new Character();
		c1.closeAttack();
		
		System.out.println("----2----");
		Character c2 = new Character();
		c2.rifleAttack();
		
		System.out.println("----3----");
		Character c3 = new Character() {
			@Override
			public void attack() {
				System.out.println("소총 공격");
			}
		};
		c3.attack();


	}

}
