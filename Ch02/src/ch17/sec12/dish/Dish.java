package ch17.sec12.dish;

public class Dish {

	private String name;
	private String category;
	private boolean vegetarian;
	private int calorie;
	
	public Dish(String name, boolean vegetarian, int calorie) {
		super();
		this.name = name;
		switch(name) {
			case "갈비찜":
			case "불고기":
			case "산적":
				this.category = "고기";
				break;
			case "고등어구이":
			case "갈치구이":
				this.category = "생선";
				break;
			case "사과":
				this.category = "과일";
				break;
			case "취나물무침":
			case "배루김치":
			case "떡국":
			case "잡채":
				this.category = "기타";
				break;
			default:
				this.category = "기타";
				
		}
		this.vegetarian = vegetarian;
		this.calorie = calorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public void printInfo() {
		System.out.print(name+"|");
		System.out.print(category+"|");
		if(vegetarian) {
			System.out.print("가능|");
		} else {
			System.out.print("불가능|");
		}
		System.out.println(calorie+"(kcal)");
	}
	
}
