package Ch05.sec11;

import Ch06.sec15.Actor;


public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====Object1====");
		String title = "탑건 메버릭";
		String category = "액션";
		String director = "조셉 코신스키";
		int runningTime = 130;
		
		Actor[] actorArray = new Actor[3];
		actorArray[0] = MovieService.makeActor("탐 크루즈","남자","1962.07.03","미국");
		actorArray[1] = MovieService.makeActor("마일스 텔러","남자","1987.02.20","미국");
		actorArray[2] = MovieService.makeActor("모니카 바바로","여자","1990.06.18","미국");
		
		MovieActorInfoArray m1 = new MovieActorInfoArray(title,category,director,runningTime,actorArray);
		m1.printInfo();
		
		
	}

}
