package Ch05.sec11.examSalary;

public class Employee {

	String number;
	String name;
	int salary;
	int score;
	char grade;
	double increaseRate;
	int nextSalary;
	
	public Employee(String number, String name, int salary, int score) {
		super();
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.score = score;
		
		if(score>=95) {
			grade='S';
			increaseRate=0.15;
		}
		else if(score>=90) {
			grade='A';
			increaseRate = 0.1;
		}
		else if(score>=80) {
			grade='B';
			increaseRate = 0.05;
		}
		else if(score>=70) {
			grade='C';
			increaseRate = 0.03;
		}
		else {
			grade='D';
			increaseRate = 0.0;
		}
		
		nextSalary = (int)(salary + salary*increaseRate);

		
		
	}
	
	
}
