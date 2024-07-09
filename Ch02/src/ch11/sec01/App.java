package ch11.sec01;

public class App {

    public static void main(String args[]) {

        // ==================================================
        // # 문제 발생
        // 배열의 크기는 2개인데, 인덱스 2번 공간에 접근하려고 함
        // ==================================================
        System.out.println("===== START =====");

        String[] stringArray = { "A", "B" };

        int index = 0;
        int max = 3;
        while (index < max) {

        	try {
        		System.out.print("index[" + index + "] ");
        		System.out.println(stringArray[index]);// java.lang.ArrayIndexOutOfBoundsException
        		index++;
        	} catch (IndexOutOfBoundsException e) {
                System.out.println("---- catch ----");
                index++;
                e.printStackTrace();
            } finally {
            	System.out.println("\n---- finally ----");
            	System.out.println();
            	
            }

        } 

        System.out.println("===== END =====");
    }

}