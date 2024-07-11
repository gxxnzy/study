package ch16.sec02.draw;

public class App {

	public static void main(String[] args) {
		System.out.println("==== Lambda ====");
		System.out.println("---- Type 1. ----");
		
		IDrawable drawable1 = () -> System.out.println("동그라미");
		drawable1.draw();

		System.out.println("---- Type 1. ----");
		
		IDrawable drawable2 = () -> { 
			System.out.println("삼각형");
			System.out.println("사각형");
			};
		drawable2.draw();
		
		System.out.println("==== Anonymous ====");
		System.out.println("---- Type 1. ----");
		
		IDrawable drawable3 = new IDrawable() {
			@Override
			public void draw() {
				System.out.println("동그라미");
			}	
		};
		drawable3.draw();
		
		System.out.println("---- Type 2. ----");
		
		IDrawable drawable4 = new IDrawable() {
			@Override
			public void draw() {
				System.out.println("삼각형");
				System.out.println("사각형");
			}	
		};
		drawable4.draw();
		
	}

}
