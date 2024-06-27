package Ch06.sec06.exam01;

public class MovieExample {

	public static void main(String[] args) {
		

		System.out.println("====Object1====");
		MovieRefactor m1 = new MovieRefactor();
		m1.setTitle("탑건:매버릭");
		m1.setCategory("액션");
		m1.setDirector("조헵 코신스키");
		m1.setRunningTime(110);
		m1.printInfo();
		
		System.out.println("====Object2====");
		MovieRefactor m2 = new MovieRefactor("아바타:물의길","SF");
		m2.setDirector("제임스 카메론");
		m2.setRunningTime(192);
		m2.printInfo();
		
		System.out.println("====Object3====");
		MovieRefactor m3 = new MovieRefactor("인사이드아웃","애니메이션","켈시 맨",96);
		m3.printInfo();


	}

}
