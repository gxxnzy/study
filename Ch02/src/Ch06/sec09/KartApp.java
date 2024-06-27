package Ch06.sec09;

public class KartApp {

	public static void main(String[] args) {
		Kart kart = new Kart("버스트","Green");
		
		System.out.println("==== kart Info ====");
		kart.printKartInfo();

		System.out.println("\n==== RUN ====");
		
		kart.speedUp();
		kart.speedUp();
		kart.pickupBooster();
		kart.pickupBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();
		
	}

}
