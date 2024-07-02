package Ch05.sec11.examBook;

public class BookService {

	public static Book makeBook(String category,String name,String author,String publisher,int price,String isbn) {
		Book book = new Book(category,name,author,publisher,price,isbn);
		return book;
	}
}
