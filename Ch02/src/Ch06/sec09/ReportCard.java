package Ch06.sec09;

public class ReportCard {

	String name;
	int korean;
	int english;
	int math;
	
	
	
	public ReportCard(String name) {
		super();
		this.name = name;
	}

	public ReportCard(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	int sum() {
		return korean + english + math;
	}
	
	int average() {
		return sum()/3;
	}
	
	char grade() {
		int g = average();
		if (g>=90) {
			return 'A';
		}else if (g>=80) {
			return 'B';
		}else if (g>=70) {
			return 'C';
		}else if (g>=60) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	void printInfo() {
		System.out.println("이름="+ name);
		System.out.println("국어="+ korean);
		System.out.println("영어="+ english);
		System.out.println("합계="+ sum());
		System.out.println("평균="+ average());
		System.out.println("학점="+ grade());
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
}
