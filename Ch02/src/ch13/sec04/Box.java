package ch13.sec04;

public class Box<T extends Number> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printInfo() {
        System.out.println("data=" + data);
    }

}