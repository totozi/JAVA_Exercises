package jungsuk.exercise.ch12;

public class Exercise12_1 {
    public static void main(String[] args) {
        // Box<Object> b1 = new Box<String>();
        // Box<Object> b2 = (Object)new Box<String>();
        // new Box<String>().setItem(new Object());
        new Box<String>().setItem("ABC");

    }
}

class Box<T> { // 지네릭 타입 T 선언
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

