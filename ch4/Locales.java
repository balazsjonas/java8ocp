package ch4;

import java.time.Instant;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Locales {

  public static void main(String[] args) {
    Locale hu = new Locale("hu");
    Locale en = new Locale("en");
    ZonedDateTime now = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
        .withLocale(hu);
    System.out.println(now.format(formatter.withLocale(new Locale("tlh"))));
    Arrays.stream(Locale.getAvailableLocales())
        .sorted(Comparator.comparing(Locale::getLanguage))
        .map(l -> l.getLanguage() + ": " + l.getDisplayLanguage(en) + " - " + l.getCountry())
        .forEach(System.out::println);
    System.out.println(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Budapest")));
    System.out.println(YearMonth.now());
  }

}
