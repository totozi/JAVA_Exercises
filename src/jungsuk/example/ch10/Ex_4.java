package jungsuk.example.ch10;

import java.util.Calendar;

public class Ex_4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2019, 7, 31);

        System.out.println(toString(date));
        System.out.println("1 day later");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("6 monthes ago");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("31 day later(roll)");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("31 day later(roll)");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일 ";
    }
}
