package jungsuk.example.ch12;

import java.util.ArrayList;

class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Tv>           tvList = new ArrayList<>();

        productList.add(new Tv());
        productList.add(new Tv());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);
//        printAll(tvList);  // 컴파일 에러, 서로 상속관계에 있어도 지네릭 타입이 일치해야 한다.
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }

    }
}
