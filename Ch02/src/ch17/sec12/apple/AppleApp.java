package ch17.sec12.apple;

import java.util.Arrays;
import java.util.List;

public class AppleApp {

	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(
				new Apple(200,Color.GREEN),
				new Apple(180,Color.RED),
				new Apple(120,Color.RED),
				new Apple(160,Color.RED),
				new Apple(80,Color.GREEN),
				new Apple(150,Color.GREEN)
				);
		
		System.out.println("==== 녹색 사과(정렬: 무게 오름차순) ====");
		List<Apple> greenApple = inventory.stream().filter(n -> n.getColor().equals("green")).toList();
		greenApple.stream().sorted((s1,s2)->Integer.compare(s1.getWeight(), s2.getWeight())).forEach(n->System.out.println("컬러="+n.getColor()+"|무게="+n.getWeight()));
		
		System.out.println("\n==== 빨간 사과(정렬: 무게 내림차순) ====");
		List<Apple> redApple = inventory.stream().filter(n -> n.getColor().equals("red")).toList();
		redApple.stream().sorted((s1,s2)->Integer.compare(s2.getWeight(), s1.getWeight())).forEach(n->System.out.println("컬러="+n.getColor()+"|무게="+n.getWeight()));
		
		System.out.println("\n==== 무거운 사과(정렬: 무게 오름차순) ====");
		System.out.println("* 기준: 무게 150 이상 *");
		List<Apple> heavyApple = inventory.stream().filter(n -> n.getWeight() >= 150).toList();
		heavyApple.stream().sorted((s1,s2)->Integer.compare(s1.getWeight(), s2.getWeight())).forEach(n->System.out.println("컬러="+n.getColor()+"|무게="+n.getWeight()));
	
		System.out.println("\n==== 무거운 빨간 사과(정렬: 무게 오름차순) ====");
		System.out.println("* 기준: 무게 150 이상 *");
		List<Apple> redHeavyApple = inventory.stream().filter(n -> n.getWeight() >= 150 && n.getColor().equals("red")).toList();
		redHeavyApple.stream().sorted((s1,s2)->Integer.compare(s1.getWeight(), s2.getWeight())).forEach(n->System.out.println("컬러="+n.getColor()+"|무게="+n.getWeight()));
	}

}
