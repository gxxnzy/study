package Ch06.sec06.exam01;

public class MovieRefactor {

	private String title;
	private String category;
	private String director;
	private int runningTime;
	
	MovieRefactor(){}
	
	MovieRefactor(String title, String category){
		this.title = title;
		this.category = category;
	}
	
	public MovieRefactor(String title, String category, String director, int runningTime) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}

	void printInfo() {
		System.out.println("title=" + title);
		System.out.println("category=" + category);
		System.out.println("director=" + director);
		System.out.println("runningTime=" + runningTime);
		System.out.println();

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
}
