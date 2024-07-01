package Ch05.sec11;

public class MovieActorArray {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private String[] actorArray;
	
	MovieActorArray(){}
	
	MovieActorArray(String title, String category){
		this.title = title;
		this.category = category;
	}
	
	public MovieActorArray(String title, String category, String director, int runningTime, String[] actorArray) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}

	void printInfo() {
		System.out.println("title=" + title);
		System.out.println("category=" + category);
		System.out.println("director=" + director);
		System.out.println("runningTime=" + runningTime);
		for(int i=0;i<actorArray.length;i++){
			System.out.println("배우=" + actorArray[i]);
		}
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
