package Ch06.sec15;

public class Song {
	String title;
	String releaseDate;
	Singer singer;
	
	public Song(String title, String releaseDate, Singer singer) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	public void printInfo() {
		System.out.print("제목="+title);
		System.out.println(" | 발매일="+releaseDate);
		singer.printInfo();

	}
	
}
