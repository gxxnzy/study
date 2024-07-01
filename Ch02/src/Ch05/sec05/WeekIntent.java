package Ch05.sec05;

public class WeekIntent {

	public static void main(String[] args) {
		
		String daysString = "일,월,화,수,목,금,토";
		String[] daysToken = daysString.split(",");
		
		for(int i=0;i<daysToken.length;i++) {
			for(int j=0;j<i;j++)
				System.out.print("\t");
			System.out.println(daysToken[i]+"요일");
		}
	}

}
