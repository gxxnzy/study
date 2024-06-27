package Ch06.sec09;

public class PayApp {

	public static void main(String[] args) {
		
		int hourPay = 9860;
		
		Pay p = new Pay();
		
		System.out.println("\n==== 하루 급여 ====");
		int dayPay = p.getDayPay(hourPay);
		System.out.println("급여="+dayPay);
		
		System.out.println("\n==== 주 급여 ====");
		int weekPay = p.getWeekPay(hourPay);
		System.out.println("급여="+weekPay);
		
		System.out.println("\n==== 연 급여 ====");
		int yearPay = p.getYearPay(hourPay);
		System.out.println("급여="+yearPay);
	}

}
