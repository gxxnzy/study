package Ch05.sec11.examBook;

import Ch05.sec11.DecimalUtil;

public class Book {

	String category;
	String name;
	String author;
	String publisher;
	int price;
	String isbn;
	
	public Book(String category, String name, String author, String publisher, int price, String isbn) {
		super();
		this.category = category;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
	}
	
	public static void printBook(Book book) {
		//System.out.println((i+1)+".");
		switch(book.category) {
			case "comic": 
				System.out.println("분야=코믹");
				break;
			case "travel": 
				System.out.println("분야=여행"); 
				break;
			case "food": 
				System.out.println("분야=음식");
				break;
			case "health": 
				System.out.println("분야=건강");
				break;
			case "pc": 
				System.out.println("분야=컴퓨터"); 
				break;
			case "etc": 
				System.out.println("분야=기타");
				break;
		}
		
		System.out.println("제목="+book.name);
		System.out.println("저자="+book.author);
		System.out.println("출판사="+book.publisher);
		
		System.out.println("가격="+DecimalUtil.decimalComma(book.price)+"(원)");
		System.out.println("isbn="+book.isbn);
		System.out.println();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAutor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
