package ch4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Periods {

  public static void main(String[] args) {
    LocalDate jan31 = LocalDate.of(2021, 1, 31);
    System.out.println("jan31:      " + jan31);
    System.out.println("jan31 + 1M: " + jan31.plus(Period.ofMonths(1)));
    System.out.println("jan31 +30d: " + jan31.plusDays(30));

    System.out.println(Period.between(jan31, jan31.plusMonths(1)));
    System.out.println(Period.between(jan31, jan31.plusDays(30)));
    System.out.println();

    ZonedDateTime time = ZonedDateTime.of(jan31, LocalTime.NOON, ZoneId.of("Europe/Budapest"));
    System.out.println(time);
    System.out.println(time.plusMonths(6));
    System.out.println(time.plus(Period.ofMonths(6)));
  }

}
