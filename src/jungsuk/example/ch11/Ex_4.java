package jungsuk.example.ch11;

import java.awt.print.Pageable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex_4 {

    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            try {
                // 입력받기
                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();

                if("".equals(input)) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help    - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input); // history를 저장

                    LinkedList tmp = (LinkedList)queue;
                    ListIterator iterator = tmp.listIterator();

                    while(iterator.hasNext()) {
                        System.out.println(++i + "." + iterator.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if(!"".equals(input)) {
            queue.offer(input);
        }
        if (queue.size() > MAX_SIZE) {
            queue.remove();
        }
    }
}
