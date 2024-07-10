package ch13.sec05.product;

public class BoxApp {

	public static void main(String[] args) {
		
		Shirts s = new Shirts("루즈핏 반팔 티셔츠",30000,"L","070-0123/5678");
		Box<Shirts> bs = new Box<>(s);
		bs.printInfo();
		
		Umbrella u = new Umbrella("3단 자동우산",18000,105,"010-1111-2222 반품배송료 5,000(원)");
		Box<Umbrella> bu = new Box<>(u);
		bu.printInfo();
		
//		FrozenFruit ff = new FrozenFruit("냉동 칠레산 블루베리",11900);
//		Box<FrozenFruit> bff = new Box<FrozenFruit>(ff);
	}

}
