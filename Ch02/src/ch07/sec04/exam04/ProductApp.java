package ch07.sec04.exam04;

public class ProductApp {

    public static void main(String[] args) {

        // ========================================
        // # 상속
        // Product <- Fruit <- FrozenFruit, DriedFruit
        // Product <- Fashion <- Shirts, Umbrella
        // ========================================

        System.out.println("===== 제품 =====");
        Product p = new Product("핸드크림", 4500);
        p.printInfo();

        System.out.println("\n===== 냉동과일 =====");
        FrozenFruit ff1 = new FrozenFruit("냉동 칠레산 블루베리 1kg", 11900);
        ff1.printInfo();

        System.out.println("\n===== 건과일 =====");
        DriedFruit df1 = new DriedFruit("유기농 건 살구 250g", 9300);
        df1.printInfo();

        DriedFruit df2 = new DriedFruit("건망고 150", 6900, "냉장(종이포장)");
        df2.printInfo();

        System.out.println("\n===== 셔츠 =====");
        Shirts s = new Shirts("루즈핏 반팔 티셔츠", 30000, 'L', "070-0123-5678");
        s.printInfo();

        System.out.println("\n===== 우산 =====");
        Umbrella u = new Umbrella("3단 자동우산", 18000, 105, "010-1111-2222  반품배송료 5,000(원)");
        u.printInfo();
    }

}
/*
@@@@@ PROGRAM @@@@@

===== Objectives =====
Product.java            : 제품
Fruit.java                    : 과일
FrozenFruit.java    : 냉동과일
DriedFruit.java        : 건과일
Fashion.java            :    패션
Shirts.java                : 셔츠
Umbrella.java        : 우산

===== Requirements =====
상속 관계
  Product    <- Fruit    <- FrozenFuit, DriedFruit
  Product    <- Fashion    <- Shirts, Umbrella
*/