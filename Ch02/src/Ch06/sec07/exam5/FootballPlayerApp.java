package Ch06.sec07.exam5;

public class FootballPlayerApp {

	public static void main(String[] args) {

		System.out.println("==== Object 1 ====");
		FootballPlayer fp1 = new FootballPlayer("이강인","PSG","19",4,5);
		fp1.printInfo();
		
		System.out.println("==== Object 2 ====");
		FootballPlayer fp2 = new FootballPlayer();
		fp2.setName("손흥민");
		fp2.setUniformNumber("7");
		fp2.setTeamName("토트넘");
		fp2.setSpeed(5);
		fp2.setTech(5);
		fp2.printInfo();


	}

}
