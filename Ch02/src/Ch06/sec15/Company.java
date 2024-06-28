package Ch06.sec15;

public class Company {
	
	String name;
	String biz;
	
	public Company(String name, String biz) {
		super();
		this.name = name;
		this.biz = biz;
	}
	
	public void printInfo() {
		System.out.println("회사명="+name+" | 사업분야="+biz);
	}
	
}
