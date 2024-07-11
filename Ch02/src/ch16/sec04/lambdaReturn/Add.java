package ch16.sec04.lambdaReturn;

public class Add {
	public void action(IAddable addable) {
		int result = addable.add(1,2);
		System.out.println("i+j=" + result);
	}
}
