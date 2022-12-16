package jungsuk.exercise.ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
        cal.set(2020,Calendar.JANUARY,1);

        for (int i = 0; i < 12; i++) {
            int weekday = cal.get(Calendar.DAY_OF_WEEK);

            int secondSunday = (weekday == 1) ? 8 : 16 - weekday;

            cal.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date d = cal.getTime();
            System.out.println(df.format(d));

            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);

        }


    }
}
