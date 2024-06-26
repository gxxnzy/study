package Ch06.sec08.exam03;

public class SunCreamApp {

	public static void main(String[] args) {
		SunCream sc1 = new SunCream();
		
		sc1.setCompany("니베아");
		sc1.setName("선 페이스 수딩 센서티브 크림");
		sc1.setStickiness(false);
		sc1.setSkinType('s');
		sc1.setCapacity(50);
		sc1.setSpf(50);
		sc1.setPa("+++");
		
		sc1.printInfo();
	}

}
