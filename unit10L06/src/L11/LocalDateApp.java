package L11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateApp {
    public static void main(String[] args)  {
        LocalDateTime jan1 = LocalDateTime.parse("2020-01-01 3:00 PM", DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
        System.out.println(jan1);

        LocalDate endOfFeb = LocalDate.of(2020, 2, 5).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("-----------------");
        System.out.println(endOfFeb);
    }
}
