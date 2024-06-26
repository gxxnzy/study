package Ch06.sec08.exam03;

public class Biz {
	private int age;
	private int height;
	private int month;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			this.age=0;
		}else {
			this.age = age;
		}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height<0) {
			this.height=0;
		}else {
			this.height = height;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<=0 | month>12) {
			this.month=1;
		}else {
			this.month = month;
		}
	}
	
	
}
