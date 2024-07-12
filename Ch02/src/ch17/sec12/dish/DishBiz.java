package ch17.sec12.dish;

import java.util.List;

public class DishBiz {

	private List<Dish> dishList;
	
	private static long count;
	private static long totalSum;

	public DishBiz(List<Dish> dishList) {
		super();
		this.dishList = dishList;
	}

	public void printAllDishes() {
		System.out.println("==== 음식 전체 ====");
		System.out.println("-----------------");
		System.out.println("음식|종류|채식주의자 식사 가능 여부|열량(칼로리)");
		System.out.println("-----------------");
		dishList.stream().forEach(n->n.printInfo());
		System.out.println();
	}

	public void printMeatDish() {
		System.out.println("==== 고기 ====");
		dishList.stream().filter(n->n.getCategory().equals("고기")).forEach(n->n.printInfo());
		System.out.println();

	}

	public void printFishDish() {
		System.out.println("==== 생선 ====");
		dishList.stream().filter(n->n.getCategory().equals("생선")).forEach(n->n.printInfo());
		System.out.println();

	}

	public void printVegetatianDish() {
		System.out.println("==== 채식주의자 식사 가능 ====");
		dishList.stream().filter(n->n.isVegetarian()).forEach(n->n.printInfo());
		System.out.println();
		
	}

	public void printHighCaloriesDish() {
		System.out.println("==== 고열량(정렬: 열량 내림차순) ====");
		dishList.stream().filter(n->n.getCalorie()>=400).sorted((s1,s2)-> Integer.compare(s2.getCalorie(), s1.getCalorie())).forEach(n->n.printInfo());
		System.out.println();
		
	}

	public void printLowCaloriesDish() {
		System.out.println("==== 저열량(정렬: 열량 오름차순) ====");
		dishList.stream().filter(n->n.getCalorie()<100).sorted((s1,s2)-> Integer.compare(s1.getCalorie(), s2.getCalorie())).forEach(n->n.printInfo());
		System.out.println();
	}

	public void printHowManyDishes() {
		System.out.println("==== 음식 개수 ====");
		count = dishList.stream().count();
		System.out.println(count+"(게)");
		System.out.println();

	}

	public void printTotalCalory() {
		System.out.println("==== 전체 칼로리 ====");
		totalSum = dishList.stream().mapToInt(Dish :: getCalorie).sum();
		System.out.println(totalSum+"(kcal)");
		
	}

	public void printAverageCalory() {
		System.out.println("==== 평균 칼로리 ====");
		System.out.println(totalSum/count + "(kcal)");

	}
	
	
	
	
}
