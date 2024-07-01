package Ch06.sec15;

public class Song {
	String title;
	String releaseDate;
	String singer;
	
	public Song(String title, String singer, String releaseDate) {
		super();
		this.title = title;
		this.singer = singer;
		this.releaseDate = releaseDate;
	}
	
	public void printInfo() {
		String dateYear = releaseDate.substring(0,4);
		String dateMonth = releaseDate.substring(4,6);
		String dateDay = releaseDate.substring(6);
		String releaseDateDot = dateYear+"."+dateMonth+"."+dateDay;
		
		System.out.print("제목="+title);
		System.out.print(" | 가수="+singer);
		System.out.println(" | 발매일="+releaseDateDot);
		//singer.printInfo();

	}
	
}
