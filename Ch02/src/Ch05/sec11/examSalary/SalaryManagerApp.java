package Ch05.sec11.examSalary;

public class SalaryManagerApp {

	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee("E001","James",5000,90),
				new Employee("E002","Victoria",4500,83),
				new Employee("E003","Paige",7000,85),
				new Employee("E004","Tom",5500,63),
				new Employee("E005","Rose",3800,98),
				new Employee("E006","Santiago",3400,78)
		};
		
		SalaryManager sm = new SalaryManager(employees);
		sm.printInfo();
	}

}
