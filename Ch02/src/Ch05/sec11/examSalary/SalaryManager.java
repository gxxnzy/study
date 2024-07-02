package Ch05.sec11.examSalary;

public class SalaryManager {

	Employee[] employees;

	public SalaryManager(Employee[] employees) {
		super();
		this.employees = employees;
	}
	
	void printInfo() {
		System.out.println("---------------------------------------");
		System.out.println("사번 | 이름 | 금년연봉 | 사원평가 | 등급 | 내년연봉");
		System.out.println("---------------------------------------");
		for(int i=0;i<employees.length;i++) {
			System.out.print(employees[i].number + " | ");
			System.out.print(employees[i].name + " | ");
			System.out.print(employees[i].salary + " | ");
			System.out.print(employees[i].score + " | ");
			System.out.print(employees[i].grade + " | ");
			System.out.println(employees[i].nextSalary + " | ");
		}
	}
	
}
