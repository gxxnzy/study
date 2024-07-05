package ch09.sec07.exam03;

public class Character {

	private String name;
	private String character;

	public Character() {

	}

	public Character(String name) {
		this.name = name;
	}

	public Character(String name, String character) {
		this.name = name;
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public void printInfo() {
		System.out.print("이름=" + name);
		System.out.println(" | 캐릭터=" + character);
	}

	private Attack ak = new Attack() {
		@Override
		public void attack() {
			System.out.println("근거리 공격");
		}
	};
	
	public void closeAttack() {
		ak.attack();
	}

	public void rifleAttack() {
		Attack ak = new Attack() {
			@Override
			public void attack() {
				System.out.println("소총 공격");
			}
		};
		ak.attack();
	}
	
	public void attack() {
		System.out.println("공격");
	}
}
