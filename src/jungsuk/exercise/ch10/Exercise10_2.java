package jungsuk.exercise.ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        Date date = null;

        System.out.println("날짜를 yyyy/MM/dd 형태로 입력해주세요.");

        while(scan.hasNextLine()){
            try{
                date = df.parse(scan.nextLine());
                System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
                System.out.println("날짜를 yyyy/MM/dd 형태로 입력해주세요.");
            } catch(Exception e) {
                System.out.println("날짜를 yyyy/MM/dd 형태로 다시 입력해주세요.");
            }
        }

    }
}
