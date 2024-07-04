package ch07.sec10.exam05;

public class MapleStory extends Game{

	public MapleStory(String id) {
		super(id,"메이플스토리");

		System.out.println();
	}

	@Override
	public void connect() {
		System.out.println("["+id+"] 메이플스토리 서버 접속 중...");
		System.out.println("["+id+"] 메이플스토리 서버 접속 완료");
		System.out.println("!!! Welcome to MapleStory !!!");
		System.out.println();

	}

	@Override
	public void play() {
		System.out.println("["+id+"] 메이플스토리 게임 시작");
		System.out.println();
	}

	
	
}
