package ch15.sec02.exam04;

import java.util.ArrayList;


public class MenuApp {

	public static void main(String[] args) {
		
		ArrayList<Menu> menuList = new ArrayList<Mikenu>();
		
		menuList.add(new Coffee("아메리카노",3000,"에티오피아 예가체프"));
		menuList.add(new Coffee("카푸치노",3500,"케냐 오클랜드"));
		menuList.add(new Ade("레몬에이드",4000,"레몬 시럽"));
		menuList.add(new Ade("한라봉에이드",4500,"한라봉"));
		
		for(int i=0;i<menuList.size();i++) {
			System.out.print((i+1)+".");
			Menu menu = menuList.get(i);
			menu.printInfo();
		}
	}

}
