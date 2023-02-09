package L07;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        * Date jan012020 = new Date(120, 0, 0, 0);
        * Calender cal = Calender.getInstance();
        * System.out.println(jan2020);
         */

        Calendar cal = Calendar.getInstance();
        Date date = new Date(123, 1, 6);
        date = cal.getTime();
        System.out.println(date);
        System.out.println("----------------");
        cal.set(2020, 0, 1, 15, 1, 5);
        System.out.println(cal.getTime());
        System.out.println("----------------");
        cal.add(Calendar.HOUR, 2);
        System.out.println(cal.getTime());
        System.out.println("-----------------");
    }
}
