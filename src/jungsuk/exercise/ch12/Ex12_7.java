package jungsuk.exercise.ch12;

public class Ex12_7 {
    public static void main(String[] args) {

    }
}

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() { }
}
