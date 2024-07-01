package Ch05.sec11;

public class OrderService {

	Menu[] orderArray;
	
	public OrderService(Menu[] orderArray) {
		this.orderArray = orderArray;
	}

	public void printOrder() {
		System.out.println("---- 주문 상세 ----");
		for(int i=0;i<orderArray.length;i++) {
			orderArray[i].printInfo();
		}
		
		System.out.println();
		System.out.println("---- 주문 금액 합계 ----");
		int sum;
		sum = sumPrice(orderArray);
		System.out.println(DecimalUtil.decimalComma(sum)+"(원)");
		
		
	}
	
	private int sumPrice(Menu[] orderArray) {
		int sum =0;
		for(int i=0;i<orderArray.length;i++) {
			sum += orderArray[i].getPrice();
		}
		return sum;
	}
}
