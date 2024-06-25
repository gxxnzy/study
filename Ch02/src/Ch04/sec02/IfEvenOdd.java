package Ch04.sec02;

public class IfEvenOdd {

	public static void main(String[] args) {
		int data = (int)(Math.random()*10)+1;
		
		int evenodd = data%2;
		
		switch(evenodd){
			case 0:
				System.out.println(data+":짝수");
				break;
			case 1:
				System.out.println(data+":홀수");
				break;
		}

	}

}
