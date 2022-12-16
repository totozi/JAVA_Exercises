package jungsuk.example.ch10;

import java.util.Calendar;

public class Ex_1 {
    public static void main(String[] args) {

        // basically it is a current date.
        Calendar today = Calendar.getInstance();
        System.out.println("this year : " + today.get(Calendar.YEAR));
        System.out.println("this month : " + today.get(Calendar.MONTH));
        System.out.println("this week of the year : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("this week of the month : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE is same as DAY_OF_MONTH
        System.out.println("this day of the month : " + today.get(Calendar.DATE));
        System.out.println("this day of the month : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("this day of the year : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("this day of the month : " + today.get(Calendar.DATE));

        System.out.println("AM or PM : " + today.get(Calendar.AM_PM));
        System.out.println("HOUR : " + today.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE : " + today.get(Calendar.MINUTE));
        System.out.println("SECOND : " + today.get(Calendar.SECOND));
        System.out.println("MILLISECOND : " + today.get(Calendar.MILLISECOND));

        System.out.println("TimeZone : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("Last day of this month : " + today.getActualMaximum(Calendar.DATE));



    }
}
