package ch13.sec03.genericMethod2;

public class Box<T> {

    public <T> void printInfoGeneric(T t1, T t2) {
        System.out.print("printInfoGeneric(T t1, T t2) :: t1= " + t1 + " | 클래스=" + t1.getClass().getSimpleName());
        System.out.println(" || t2= " + t2 + " | 클래스=" + t2.getClass().getSimpleName());
    }

}
