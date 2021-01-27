package ch4;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Durations {

  public static void main(String[] args) {
    ZoneId hu = ZoneId.of("Europe/Budapest");
    ZonedDateTime cestStart = ZonedDateTime.of(2021, 3, 28, 0, 0, 0, 0, hu);

    System.out.println("before CEST:  " + cestStart);
    System.out.println("jump to CEST: " + cestStart.plusHours(2));
    System.out.println(Duration.between(cestStart, cestStart.plusHours(2)));
    System.out.println(ChronoUnit.MINUTES.between(cestStart, cestStart.plusHours(2)));
    System.out.println(ChronoUnit.DAYS.between(cestStart, cestStart.plusHours(2)));
    System.out.println();

    System.out.println(cestStart);
    System.out.println(cestStart.plus(Period.ofDays(1)));
    System.out.println(cestStart.plus(Duration.ofDays(1)));
    System.out.println(cestStart.plus(Duration.ofHours(24)));


  }

}
