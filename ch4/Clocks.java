package ch4;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Clocks {

  public static void main(String[] args) {
    LocalTime.now();
    Clock clock = Clock.tickSeconds(ZoneId.systemDefault());
    clock = Clock.tickMinutes(ZoneId.systemDefault());
    clock = Clock.offset(clock, Duration.ofMinutes(10));
//    clock = Clock.systemUTC();
    LocalTime now = LocalTime.now(clock);
    System.out.println(now);
    System.out.println(now.getNano());

    LocalTime now1 = LocalTime.now(clock);
    System.out.println(now1);
    System.out.println(now.equals(now1));
  }

}
