package ch4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class PeriodVsDuration {

  public static void main(String[] args) {
    ZoneId hu = ZoneId.of("Europe/Budapest");
    LocalDate cestStartDate = LocalDate.of(2021, 3, 28);
    ZonedDateTime cestStart = ZonedDateTime.of(cestStartDate, LocalTime.MIDNIGHT, hu);
    System.out.println(cestStart);
    System.out.println(cestStart.plus(Period.ofDays(1)));
    System.out.println(cestStart.plus(Duration.ofDays(1)));

    System.out.println(cestStart.plus(Period.ofDays(2)));
    System.out.println(cestStart.plus(Duration.ofDays(2)));

    DateTimeFormatter format = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.LONG);

    System.out.println(cestStart.format(DateTimeFormatter.ofLocalizedDateTime(
        FormatStyle.LONG)
        .withLocale(Locale.forLanguageTag("hu"))));
    System.out.println(cestStart.format(format));
  }
}
