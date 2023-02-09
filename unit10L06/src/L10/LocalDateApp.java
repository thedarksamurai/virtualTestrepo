package L10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApp {
    public static void main(String[] args) {
        LocalDateTime jan1 = LocalDateTime.of(2020, 1, 1, 13, 30, 0);
        System.out.println(jan1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm:ss a")));

        LocalDateTime jan2 = LocalDateTime.of(2020, 1, 2, 9, 0, 0);
        System.out.println("Is jan1 before jan2? " +jan1.isBefore(jan2));

        LocalDateTime jan3 = jan1.plusDays(2);
        System.out.println("Is jan3 before jan2? " +jan3.isBefore(jan2));

        jan3 = jan3.minus(1, ChronoUnit.DAYS);
        System.out.println(jan3);
    }
}
