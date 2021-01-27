package ch4;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Adjusters {

  public static void main(String[] args) {
    ZonedDateTime now = ZonedDateTime.now();
    System.out.println("now:         " + now);
    System.out.println("next month:  " + now.with(TemporalAdjusters.firstDayOfNextMonth()));
    System.out.println("next monday: " + now.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
    System.out.println(now.with(Instant.now().plusSeconds(3600)));
    System.out.println();

    LocalDateTime local = now.toLocalDateTime().withNano(0);
    System.out.println("now:         " + local);
    System.out.println("next month:  " + local.with(TemporalAdjusters.firstDayOfNextMonth()));
    System.out.println("next monday: " + local.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
    System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)));
    System.out.println(local.withDayOfMonth(2));
    System.out.println();

    ZoneId fixedId = ZoneId.of("GMT+2");
    ZonedDateTime fixed = ZonedDateTime.now(fixedId);
    System.out.println("fixed:    "+ fixed);
    System.out.println("fixed+6M: "+ fixed.plusMonths(6));
    System.out.println("transitions for fixed ZoneOffset: "+ fixedId.getRules().getTransitions());
  }

}
