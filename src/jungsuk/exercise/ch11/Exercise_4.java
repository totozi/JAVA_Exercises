package jungsuk.exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Exercise_4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("가효원", 2,1,100,100,100));
        list.add(new Student("다효원", 3,2,90,95,90));
        list.add(new Student("나효원", 3,1,60,60,30));
        list.add(new Student("라효원", 2,3,100,100,100));

        Collections.sort(list, new BanNoAscending());
        Iterator it =list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class BanNoAscending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Student && o2 instanceof Student)){
            return 0;
        }
        Student st1 = (Student) o1;
        Student st2 = (Student) o2;

        if(Integer.compare(st1.ban, st2.ban) > 0){
            return 1;
        } else if(Integer.compare(st1.ban, st2.ban) < 0){
            return -1;
        } else {
            if(Integer.compare(st1.no, st2.no) >= 0) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}

