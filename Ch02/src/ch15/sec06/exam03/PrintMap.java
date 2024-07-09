package ch15.sec06.exam03;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintMap {

	Map<String, Person> personMap;

	public PrintMap(Map<String, Person> personMap) {
		this.personMap = personMap;
	}
	
	public void printPersonMap() {
		Set<String> keySet = personMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Person p = personMap.get(k);
			if(k.startsWith("t"))
				System.out.print("[교사]");
			else if(k.startsWith("s"))
				System.out.print("[학생]");
				
			p.printInfo();
		}
		
	}
	
}
