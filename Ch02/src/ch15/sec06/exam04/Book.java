package ch15.sec06.exam04;

import java.text.DecimalFormat;

import lombok.Data;

@Data
public class Book {
	private String category;
	private String name;
	private String author;
	private String publisher;
	private int price;
	private String Isbn;
	
	
	
	public void printInfo() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("분야="+category);
		System.out.println("제목="+name);
		System.out.println("저자="+author);
		System.out.println("출판사="+publisher);
		System.out.println("가격="+df.format(price));
		System.out.println("isbn="+Isbn);
		
	}



	public Book(String category, String name, String author, String publisher, int price, String Isbn) {
		super();
		this.category = category;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.Isbn = Isbn;
	}



	public Book(String[] book) {
		this.category = book[0];
		this.name = book[1];
		this.author = book[2];
		this.publisher = book[3];
		this.price = Integer.parseInt(book[4]);
		this.Isbn = book[5];
	}
	
	
}
