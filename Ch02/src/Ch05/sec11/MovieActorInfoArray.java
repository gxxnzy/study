package Ch05.sec11;

import Ch06.sec15.Actor;

public class MovieActorInfoArray {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private Actor[] actor;
	

	public MovieActorInfoArray(String title, String category, String director, int runningTime, Actor[] actor) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actor = actor;
	}



	public MovieActorInfoArray(String title, String category, String director, int runningTime) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}

	void printInfo() {
		System.out.println("제목=" + title);
		System.out.println("카테고리=" + category);
		System.out.println("감동=" + director);
		System.out.println("상영시간=" + runningTime);
		System.out.println("---- Actor Info ----");

		for(int i=0;i<actor.length;i++) {
			actor[i].printInfo();
			System.out.println();
		}

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
