package Ch04.sec02;

public class ScoreGrade {

	public static void main(String[] args) {
		int kor = 88;
		int eng = 92;
		int math = 100;
		
		System.out.print("국어="+kor);
		System.out.print(" 영어="+eng);
		System.out.println(" 수학="+math);

		int score_sum = kor+eng+math;
		System.out.print("합계="+score_sum);
		int mean = score_sum/3;
		System.out.print(" 평균="+mean);
		if (mean >= 95)
			System.out.println(" 학점=A+");
		else if (mean >= 90)
			System.out.println(" 학점=A");
		else if (mean >= 85)
			System.out.println(" 학점=B+");
		else if (mean >= 80)
			System.out.println(" 학점=B");
		else
			System.out.println(" 학점=F");


	}

}
