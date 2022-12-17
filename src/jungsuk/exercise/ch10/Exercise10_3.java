package jungsuk.exercise.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_3 {
    static int paycheckCount(Calendar from, Calendar to) {
        int monDiff = 0;

        // 1. from 또는 to가 null 이면 0을 반환하다.
        if(from == null || to == null) {
            return 0;
        }

        // 2. from와 to가 같고 날짜가 21일이면 1을 반환한다.
        if(from.getTime().equals(to.getTime()) || from.getTime().getDate() == 21) {
            return 1;
        }

        // 3. to와 from이 몇 개월 차이인지 계산해서 변수 monDiff에 담는다.
        // 1) from과 to가 연 차이가 나는 경우
        if((to.get(Calendar.YEAR) - from.get(Calendar.YEAR)) > 0) {
            monDiff = ((to.get(Calendar.YEAR) - from.get(Calendar.YEAR) - 1) * 12)
                    + (11 - from.get(Calendar.MONTH))
                    + (to.get(Calendar.MONTH) + 1);
        // 같은 년도인 경우
        } else if(to.get(Calendar.YEAR) == from.get(Calendar.YEAR)) {
            monDiff = to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
        } else {
            return 0;
        }

        // 4. monDiff < 0 이면 0 반환
        if(monDiff < 0 ) {
            return 0;
        }

        if(from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21) {
            monDiff++;
        } else if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21) {
            monDiff--;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate   =   to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : ");
        System.out.println(paycheckCount(from, to));

    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020,0,1);
        toCal.set(2020,0,1);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,21);
        toCal.set(2020,0,21);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,1);
        toCal.set(2020,2,1);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,1);
        toCal.set(2020,2,23);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,23);
        toCal.set(2020,2,21);
        printResult(fromCal, toCal);

        fromCal.set(2021,0,22);
        toCal.set(2020,2,21);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,22);
        toCal.set(2021,2,20);
        printResult(fromCal, toCal);
    }


}
