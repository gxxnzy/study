package Ch06.sec15;

public class SongApp {

	public static void main(String[] args) {
		System.out.println("==== Singer Info ====");
		String name = "아이유";
		char sex = 'F';
		String birthDate = "1993.05.16";
		String companyt = "이담 엔터테인먼트";
		Singer singer = new Singer(name,sex,birthDate,companyt);
		singer.printInfo();
		
		System.out.println("==== Singer Info ====");
		String title = "밤편지";
		String releaseDate = "2019.03.24";
		Song song = new Song(title,releaseDate,singer);
		song.printInfo();

	}

}
