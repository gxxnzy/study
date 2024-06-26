package Ch06.sec08.exam04;

public class Message {

	void printInfo(String str) {
		System.out.println(str);
	}
	
	void printInfo(int num) {
		System.out.println(num);
	}
	
	void printInfo(String str,int num) {
		System.out.println(str + ", " + num);
	}
	
	void printInfo(int num,String str) {
		System.out.println(num + ", " + str);
	}
}
