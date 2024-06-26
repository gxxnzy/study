package Ch06.sec06.exam01;

public class MovieExample {

	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		
		System.out.println("====초기값====");
//		System.out.println("title=" + m1.title);
//		System.out.println("category=" + m1.category);
//		System.out.println("director=" + m1.director);
//		System.out.println("runningTime=" + m1.runningTime);
//		m1.printInfo();
		
		m1.setTitle("기생충");
		System.out.println(m1.getTitle());
		
		m1.setCategory("스릴러");
        System.out.println(m1.getCategory());

        m1.setDirector("봉준호");
        System.out.println(m1.getDirector());

        m1.setRunningTime(132);
        System.out.println(m1.getRunningTime());

		

		System.out.println();
		System.out.println("====값 변경====");
		
		m1.printInfo();
		
//		System.out.println("title=" + m1.title);
//		System.out.println("category=" + m1.category);
//		System.out.println("director=" + m1.director);
//		System.out.println("runningTime=" + m1.runningTime);
	}

}
