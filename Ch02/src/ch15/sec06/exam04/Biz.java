package ch15.sec06.exam04;

import java.util.ArrayList;
import java.util.List;

public class Biz {

	public Biz() {
		super();
	}

	public List<Book> convert(String[] contents){
		List<Book> list = new ArrayList<>();
		for(int i=0;i<contents.length;i++) {
			String[] book = contents[i].split("/");
			list.add(new Book(book));
		}
		return list;
	}
}
