package jungsuk.exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("가효원", 1,1,100,100,100));
        list.add(new Student("다효원", 1,1,90,95,90));
        list.add(new Student("나효원", 1,1,60,60,30));
        list.add(new Student("라효원", 1,1,100,100,100));

        Collections.sort(list);
        Iterator it =list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int)((getTotal()/ 3f) * 10 + 0.5)/10f;
    }

    public String toString(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }


    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        if(this.name.compareTo(student.name) >= 0){ // 두 문자열 아스키값의 차이가 0보다 크면 1
            return 1;
        } else { // 아니면 -1로 순서 바꿔주기
            return -1;
        }
    }
}
