package Ch04.sec05;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Person person = new Person();
		
		System.out.print("이름을 입력하세요 =>");
		person.name = scan.nextLine();
		System.out.print("나이를 입력하세요 =>");
		person.age = scan.nextInt();
		
		person.printInfo();
		
		scan.close();
	}

}
