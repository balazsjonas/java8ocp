package ch4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class Zones {

  public static void main(String[] args) {

    ZoneId hu = ZoneId.of("Europe/Budapest");
    ZoneId gb = ZoneId.of("Europe/London");
    ZoneId gmt1 = ZoneId.of("GMT+1");
    LocalTime time = LocalTime.of(1, 30);
    LocalDate winter = LocalDate.of(2021, 3, 28);
    ZonedDateTime winterTime = ZonedDateTime.of(winter, time, hu);
    ZonedDateTime summerTime = winterTime.plusDays(1);
    System.out.println("winter: " + winterTime);
    System.out.println("summer: " + summerTime);
    System.out.println();

    System.out.println("GB same instant: " + summerTime.withZoneSameInstant(gb));
    System.out.println("GB same local:   " + summerTime.withZoneSameLocal(gb));
    System.out.println();

    ZonedDateTime fixedZone = winterTime.withZoneSameInstant(gmt1);
    System.out.println("fixed to winter" + fixedZone);
    System.out.println("fixed (next day)" + fixedZone.plusDays(1));
    System.out.println();

    ZoneRules rules = hu.getRules();
    System.out.println(rules);
    System.out.println("offset(now()): " + rules.getOffset(Instant.now()));
    System.out.println("Daylight savings: " + rules.getDaylightSavings(Instant.now()));
    System.out.println("rules.isFixedOffset: " + rules.isFixedOffset());
    System.out
        .println("fixedZone...isFixedOffset:" + fixedZone.getZone().getRules().isFixedOffset());
  }

}
