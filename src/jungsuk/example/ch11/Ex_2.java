package jungsuk.example.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= stack =");
        while(!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
