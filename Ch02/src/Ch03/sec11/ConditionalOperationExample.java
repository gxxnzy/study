package Ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// A, B
        int score = 70;
        char grade = (score >= 90) ? 'A' : 'B';
        System.out.println("grade=" + grade);

        // A, B, C
        score = 70;
        grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.println("grade=" + grade);

	}

}
