package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MenuApp {

	public static void main(String[] args) {
		Map<String, Menu> map = new HashMap<String, Menu>();
		
		map.put("a", new Coffee("아메리카노",3000,"에티오피아 예가체프"));
		map.put("b", new Coffee("카푸치노",3500,"케냐 오클랜드"));
		map.put("c", new Ade("레몬에이드",4000,"레몬 시럽"));
		map.put("d", new Ade("한라봉에이드",4500,"한라봉"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Menu menu = map.get(k);
			menu.printInfo();
		}
	}
}