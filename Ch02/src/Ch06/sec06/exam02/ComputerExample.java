package Ch06.sec06.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,3,4);
		System.out.println("result1:"+result1);
		
		int result2 = myCom.sum(1,3,4,7,8,9);
		System.out.println("result1:"+result2);
		
		int[] values = {1,2,3,5,8};
		int result3 = myCom.sum(values);
		System.out.println("result3:"+result3);
		
	}

}
