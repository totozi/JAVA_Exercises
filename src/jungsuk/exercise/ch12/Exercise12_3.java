package jungsuk.exercise.ch12;

public class Exercise12_3 {
    public static void main(String[] args) {
        Box2<?> b1 = new Box2();
        Box2<?> b2 = new Box2<>();
//        Box2<?> b3 = new Box<Object>();
//        Box2<Object> b4 = new Box2<Fruit>;
        Box2 b5 = new Box2<Fruit>();
        Box2<? extends Fruit> b6 = new Box2<Apple>();
//        Box2<? extends Object> b7 = new Box2<? extends Fruit>(); // new 연산자는 타입이 명확해야함

    }
}

class Box2<T extends Fruit>{
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

class Fruit {}
class Apple extends Fruit {}