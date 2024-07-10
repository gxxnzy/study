package ch13.sec04;

public class BoxApp {

    public static void main(String[] args) {

        System.out.println("----- Biz<Integer> -----");
        Box<Integer> integerBox = new Box<>();
        integerBox.setData(1);
        integerBox.printInfo();

        System.out.println("\n----- Biz<Double> -----");
        Box<Double> doubleBox = new Box<>();
        doubleBox.setData(1.1);
        doubleBox.printInfo();


        System.out.println("\n----- Biz<String> -----");
//        Box<String> stringBox = new Box<>();    // Error. 

    }

}
