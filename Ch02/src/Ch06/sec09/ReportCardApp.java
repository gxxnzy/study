package Ch06.sec09;

public class ReportCardApp {

	public static void main(String[] args) {
		
		System.out.println("\n==== Object1 ====");
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78;
		
		ReportCard rc1 = new ReportCard("Victoria",korean1,english1,math1);
		
		int sum1 = rc1.sum();
		System.out.println("합계="+sum1);
		int average1 = rc1.average();
		System.out.println("합계="+average1);
		char grade1 = rc1.grade();
		System.out.println("학점="+grade1);

		System.out.println("\n==== printInfo() ====");
		rc1.printInfo();
		
		System.out.println("\n==== Object1 ====");
		int korean2 = 88;
		int english2 = 100;
		int math2 = 92;
		
		ReportCard rc2 = new ReportCard("Paige");
		rc2.setKorean(korean2);
		rc2.setEnglish(english2);
		rc2.setMath(math2);
		
		int sum2 = rc2.sum();
		System.out.println("합계="+sum2);
		int average2 = rc2.average();
		System.out.println("합계="+average2);
		char grade2 = rc2.grade();
		System.out.println("학점="+grade2);

		System.out.println("\n==== printInfo() ====");
		rc2.printInfo();
		


	}

}
