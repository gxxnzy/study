package Ch06.sec09;

public class Pay {

	int dayPay;
	int weekPay;
	int yearPay;
	
	public int getDayPay(int hourPay) {
		dayPay = hourPay*8;
		return dayPay;
	}
	public void setDayPay(int dayPay) {
		this.dayPay = dayPay;
	}
	public int getWeekPay(int hourPay) {
		weekPay = hourPay*8*5;
		return weekPay;
	}
	public void setWeekPay(int weekPay) {
		this.weekPay = weekPay;
	}
	public int getYearPay(int hourPay) {
		yearPay = hourPay*8*5*52;
		return yearPay;
	}
	public void setYearPay(int yearPay) {
		this.yearPay = yearPay;
	}

	
}
