package Ch05.sec11.examBook;


public class BookStore {
	
	Book[] bookArray;

	public BookStore(Book[] bookArray) {
		super();
		this.bookArray = bookArray;
	}

	public void printBookStore() {
		for(int i=0;i<bookArray.length;i++) {
			
			Book.printBook(bookArray[i]);
		}
	}

	public void printBookByIsbn(String isbn) {
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getIsbn()==isbn) {
				Book.printBook(bookArray[i]);
				return;
			}
		}
		System.out.println("No data available");
		return;
	}

	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		int count = 0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getPrice()>=betweenMinPrice & bookArray[i].getPrice()<=betweenMaxPrice) {
				count++;
				System.out.println(count+".");
				Book.printBook(bookArray[i]);
			}
		}
		if(count==0) {
			System.out.println("No data available");
			return;
		}
	}

	public void printBooksByCategory(String category) {
		int count = 0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getCategory() == category) {
				count++;
				System.out.println(count+".");
				Book.printBook(bookArray[i]);
				
			}
		}
		if(count==0) {
			System.out.println("No data available");
			return;
		}
		
	}

	public void printBooksByMaxPrice(int maxPrice) {
		int count = 0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getPrice() <= maxPrice) {
				count++;
				System.out.println(count+".");
				Book.printBook(bookArray[i]);
				
			}
		}
		if(count==0) {
			System.out.println("No data available");
			return;
		}
		
	}

	public void printBooksByMinPrice(int minPrice) {
		int count = 0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getPrice() >= minPrice) {
				count++;
				System.out.println(count+".");
				Book.printBook(bookArray[i]);
				
			}
		}
		if(count==0) {
			System.out.println("No data available");
			return;
		}
	}

	public void printBooksByTitleLike(String title) {
		int count = 0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getName().indexOf(title)!=-1) {
				count++;
				System.out.println(count+".");
				Book.printBook(bookArray[i]);
				
			}
		}
		if(count==0) {
			System.out.println("No data available");
			return;
		}
		
	}
	
}
