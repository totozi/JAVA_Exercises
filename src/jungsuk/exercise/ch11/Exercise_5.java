package jungsuk.exercise.ch11;

import java.util.HashSet;
/*
String클래스의 hashCode()는 객체의 주소가 아닌 문자열의 내용을 기반으로 해시코드를
생성하므로 문자열의 내용이 같으면 항상 같은 값의 해시코드를 반환한다.
 */
public class Exercise_5 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num     = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard c = (SutdaCard) obj;
            return num == c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    public String toString(){
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();

    }
}
