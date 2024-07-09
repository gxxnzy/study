package ch15.sec06.exam04;

import java.util.List;

public class BookStore {

	List<Book> bookList;

	public BookStore(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	public void printBookStore() {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			System.out.println(++count+".");
			Book b = bookList.get(i);
			b.printInfo();
			System.out.println();
		}
	}

	public void printBookByCategory(String category) {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
			if(b.getCategory().equals(category)) {
				System.out.println(++count+".");
				b.printInfo();
				System.out.println();
			}
		}
		
	}

	public void printBookByIsbn(String isbn) {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
			if(b.getIsbn().equals(isbn)) {
				System.out.println(++count+".");
				b.printInfo();
				System.out.println();
			}
		}
		
	}

	public void printBooksByMaxPrice(int maxPrice) {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
			if(b.getPrice() <= maxPrice) {
				System.out.println(++count+".");
				b.printInfo();
				System.out.println();
			}
		}
		
	}

	public void printBooksByMinPrice(int minPrice) {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
			if(b.getPrice() >= minPrice) {
				System.out.println(++count+".");
				b.printInfo();
				System.out.println();
			}
		}
		
	}

	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		int count = 0;
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
			if(b.getPrice() >= betweenMinPrice & b.getPrice() <= betweenMaxPrice) {
				System.out.println(++count+".");
				b.printInfo();
				System.out.println();
			}
		}
		
	}
}
