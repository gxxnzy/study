package Ch05.sec06;

public class StringArray {

	public static void main(String[] args) {
		
		String[] stringArray;
		
		stringArray = new String[3];
		
		stringArray[0] = new String("Hello");
		stringArray[1] = new String("World");
		stringArray[2] = new String("Welcome");
		
		System.out.println("\n==== Output ====");
		for(int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		
	}

}
