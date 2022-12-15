package jungsuk.example.ch10;

import java.util.Calendar;

public class Ex_3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"hour", "min", "sec"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + ":"
                + time1.get(Calendar.MINUTE) + ":"
                + time1.get(Calendar.SECOND));

        System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + ":"
                + time2.get(Calendar.MINUTE) + ":"
                + time2.get(Calendar.SECOND));

        long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;

        String tmp = "";

        for (int i = 0; i < TIME_UNIT.length; i++) {
           tmp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i] + " ";
           diff %= TIME_UNIT[i];
        }
        System.out.println("diff : " + tmp);

    }
}
