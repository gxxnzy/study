package ch16.sec04.lambdaReturn;

public class App {

	public static void main(String[] args) {
		
		System.out.println("==== Anonymous ====");
		IAddable addable0 = new IAddable() {
			@Override
			public int add(int i,int j) {
				return i+j;
			}
		};
		int add0 = addable0.add(1,2);
		System.out.println("i+j=" + add0);
		
		System.out.println("\n==== Lambda ====");
		
		System.out.println("---- Type 1. ----");
		IAddable addable1 = (i,j) -> i+j;
		int add1 = addable1.add(1,2);
		System.out.println("i+j=" + add1);
		
		System.out.println("---- Type 2. ----");
		IAddable addable2 = (i,j) -> {
			return i+j;
		};
		int add2 = addable2.add(1,2);
		System.out.println("i+j=" + add2);
		
		System.out.println("---- Type 3. ----");
		IAddable addable3 = (i,j) -> {
			int k = i+j;
			return k;
		};
		int add3 = addable3.add(1,2);
		System.out.println("i+j=" + add3);

	}

}
