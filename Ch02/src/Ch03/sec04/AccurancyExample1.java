package Ch03.sec04;

public class AccurancyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit*number;
		System.out.println("사과1개에서 남은 양: " + result);

	}

}
