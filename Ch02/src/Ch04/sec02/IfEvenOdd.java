package Ch04.sec02;

public class IfEvenOdd {

	public static void main(String[] args) {
		int data = (int)(Math.random()*10)+1;
		
		if(data%2==0)
			System.out.println(data+":짝수");
		else
			System.out.println(data+":홀수");

	}

}
