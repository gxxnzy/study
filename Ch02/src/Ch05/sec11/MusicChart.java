package Ch05.sec11;

import Ch06.sec15.Song;

public class MusicChart {

	Song[] songArray;
	
	public MusicChart(Song[] songArray) {
		this.songArray = songArray;
	}
	
	public void printMusicChart() {
		for(int i=0;i<songArray.length;i++) {
			System.out.print(i+1 + ".");
			songArray[i].printInfo();
		}
	}
	
}
