package jungsuk.exercise.ch11;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise_6 {
    public static void main(String[] args) {
        Set set= new HashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30 + 1) + "");
        }
        /*
          HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 발생하는 문제이다.
          아무리 임의의 순서로 저장을 해도, 해싱(hashing) 알고리즘의 특성상 한 숫자가
          고정된 위치에 저장되기 때문이다.
        */
        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);
        Iterator it = list.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}

