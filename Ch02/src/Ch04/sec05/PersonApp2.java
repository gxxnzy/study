package Ch04.sec05;

import java.util.Scanner;

public class PersonApp2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("--------[메뉴 선택]-------");
			System.out.println("2. 등록");
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하세요");
			int menu = scan.nextInt();
			scan.nextLine();

			if (menu == 9) {
				System.out.println("종료합니다.");
				scan.close();
				break;
			} else if (menu == 2) {
				System.out.println("[등록]");
				System.out.print("이름을 입력하세요 =>");
				String name = scan.nextLine();
				System.out.print("나이를 입력하세요 =>");
				int age = scan.nextInt();
				scan.nextLine();


				Person person = new Person(name, age);
				person.printInfo();
				System.out.println("계속 진행합니다.");
			} else {
				System.out.println("다시 눌러주세요.");
			}
		}
	}

}
