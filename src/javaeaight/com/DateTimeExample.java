package javaeaight.com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate previousDay=today.minusDays(1);
        System.out.println(previousDay);

        LocalDate nexDay=today.plusDays(1);
        System.out.println(nexDay);

        // demonstrate isLeapYear() method
        LocalDate local=LocalDate.of(2000,10,01);
        System.out.println(local.isLeapYear());

        // demonstrate atTime() method
        LocalDate date=LocalDate.of(2021,01,13);
        LocalDateTime ldt=date.atTime(1,30);
        System.out.println(ldt);
    }
}
