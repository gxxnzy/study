package ch15.sec06.exam02;

import java.util.Iterator;
import java.util.List;

public class Order {

	List<Menu> menuList;
	static int countOrder = 0;
	static int globalCountMenu = 0;
	static int globalPriceSum = 0;
	
	public Order(List<Menu> menuList) {
		super();
		this.menuList = menuList;
	}


	public void printOrder() {
		System.out.println("==== 주문서 ====");
		System.out.println("*주문번호:"+ ++countOrder);
		int localCountMenu = 0;
		int localPriceSum = 0;
		Iterator<Menu> iterator = menuList.iterator(); 
		while(iterator.hasNext()) {
			Menu menu = iterator.next();
			System.out.print("\t"+ ++localCountMenu + ".");
			menu.printInfo();
			
			localPriceSum += menu.getPrice();
			globalPriceSum += menu.getPrice();
			globalCountMenu ++;
		}
		System.out.println("*주문 메뉴수: "+localCountMenu);
		System.out.println("*주문액: "+DecimalUtil.decimalComma(localPriceSum)+"(원)");
		System.out.println("주문시간: "+DateUtil.getLocalDateTimeDash());
		System.out.println();
		
	}


	public static void printSummary() {
		System.out.println("==== 정산 ====");
		System.out.println("총 주문 건수: "+ countOrder);
		System.out.println("총 주문 메뉴 수: " + globalCountMenu);
		System.out.println("총 매출: " + DecimalUtil.decimalComma(globalPriceSum) + "(원)");
		
		
	}
}
