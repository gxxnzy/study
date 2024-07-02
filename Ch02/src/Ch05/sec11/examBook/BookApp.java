package Ch05.sec11.examBook;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] bookArray = new Book[5];
		
		bookArray[0] = new Book("comic","열혈강호","정극진,양재현","대원씨아이",4500,"979-11-5754-926-9");
		bookArray[1] = new Book("travel","뉴욕 100배 즐기기","홍지윤","알에이치코리아",14400,"978-89-255-8673-1");
		bookArray[2] = new Book("travel","바르셀로나, 지금이 좋아","정다운","중앙북스",15000,"978-89-991-7580-0");
		bookArray[3] = new Book("food","오늘의 맥주","이성준","오운",18000,"979-11-92814-04-9");
		bookArray[4] = new Book("food","버번 위스키의 모든 것","조승원","(주)교육당",2400,"979-11-90277-42-6");
		
		BookStore bs = new BookStore(bookArray);
		bs.printBookStore();
	}

}
