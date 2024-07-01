package Ch05.sec11;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==== 주문 ====");

		Menu[] order = new Menu[3];
		order[0] = new Menu("빅멕세트",5500);
		order[1] = new Menu("아이스크림콘",700);
		order[2] = new Menu("아이스커피",1000);
		
		System.out.println("==== [영수증] ====");
		System.out.println("---- 주문 시간 ----");
		System.out.println(DateUtil.getLocalDateTimeDash());

		System.out.println();
		OrderService os = new OrderService(order);
		os.printOrder();
		
	}

}
