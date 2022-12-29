package jungsuk.example.ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator(); // Iterator에 제네릭스를 적용
        while(it.hasNext()) {
            Student s = it.next();
//            Student s = (Student)it.next(); // 제네릭스를 사용하지 않으면 형변환 필요
            System.out.println(s.name);
        }

        Iterator it2 = list.iterator(); // Iterator에 제네릭스를 적용
        while(it2.hasNext()) {
//            Student s = it2.next();
            Student s = (Student)it2.next(); // 제네릭스를 사용하지 않으면 형변환 필요
            System.out.println(s.name);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;

    }
}
