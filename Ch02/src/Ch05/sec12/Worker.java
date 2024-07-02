package Ch05.sec12;

public class Worker {

	String name;
	int career;
	Job job;
	
	public Worker(String name, int career, Job job) {
		super();
		this.name = name;
		this.career = career;
		this.job = job;
		System.out.println(job);
	}

	public void printInfo() {
		String jobString;
		switch(job) {
		case Job.PROGRAMMER: jobString = "프로그래머";	break;
		case Job.WEB_DESIGNER: jobString = "웹 디자이너";	break;
		case Job.UI_DESIGNER: jobString = "UI 디자이너";	break;
		default: jobString = "무직";
		}
		System.out.println("이름="+name+" | 커리어="+career+" | 직업="+jobString);
	}
	
}
