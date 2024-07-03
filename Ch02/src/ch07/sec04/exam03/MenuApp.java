package ch07.sec04.exam03;

import Ch05.sec11.Menu;

public class MenuApp {

	public static void main(String[] args) {
		
		System.out.println("==== Menu ====");
		Menu m = new Menu("녹차",3500);
		m.printInfo();
		
		System.out.println("==== Coffee ====");
		Coffee c = new Coffee("아메리카노",3000,"에티오피아 예가체프");
		c.printInfo();
		
		System.out.println("==== Ade ====");
		Ade a = new Ade("레몬에이드",4000,"레몬,시럽");
		a.printInfo();
	}

}
