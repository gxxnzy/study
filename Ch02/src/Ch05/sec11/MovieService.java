package Ch05.sec11;

import Ch06.sec15.Actor;

public class MovieService {
	
	static Actor makeActor(String name,String sex,String birthdate,String nation) {
		Actor actor = new Actor(name,sex,birthdate,nation);
		return actor;
	}


}
