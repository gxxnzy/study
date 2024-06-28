package Ch05.sec06;

public class CardRanksApp {

	public static void main(String[] args) {
		String[] cardRanks = {"1","2","3","4","5","6","7","8",
				"9","10","Jack","Queen","King"};
		
		System.out.println("==== Card Ranks ====");

		for(int i=0;i<cardRanks.length;i++) {
			System.out.printf("cardRanks[%s] %s\n",i,cardRanks[i]);
		}
	}

}
