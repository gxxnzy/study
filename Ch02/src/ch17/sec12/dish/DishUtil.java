package ch17.sec12.dish;

import java.util.Arrays;
import java.util.List;

public class DishUtil {

	public static List<Dish> getAllDishes(){
		List<Dish> dishList = Arrays.asList(
				new Dish("갈비찜", false, 531),
				new Dish("불고기", false, 471),
				new Dish("산적", false,653),
				new Dish("떡국", false,440),
				new Dish("잡채", false,191),
				new Dish("취나물무침", true,30),
				new Dish("배추김치", true, 25),
				new Dish("고등어구이", false,302),
				new Dish("갈치구이", false,450),
				new Dish("사과", true, 50)
				);
		return dishList;
	}
}
