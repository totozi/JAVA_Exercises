package jungsuk.example.ch10;

import java.util.Calendar;

public class Ex_2 {
    public static void main(String[] args) {

        final String[] DAY_OF_WEEK = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2019, 3, 29);
        System.out.println("date1 : " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("date2 : " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;

        System.out.println(difference + " sec");
        System.out.println(difference/(60*60*24) + "days");

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일 ";
    }
}
