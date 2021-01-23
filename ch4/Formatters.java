package ch4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Formatters {

  public static void main(String[] args) {
    LocalDateTime december = LocalDateTime.of(2021, 12, 1, 8, 9, 10);
    Locale en = Locale.ENGLISH;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Year: 'yyyy, 'Month: 'MM, 'hour: 'hh a" , en);
    System.out.println(formatter.format(december));
    // DateTimeParsing Exception if formatter is not complete

    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("'Year: 'yyyy, 'Month: 'MM, 'day: 'dd" , en);
    LocalDate parse = LocalDate.parse("Year: 2021, Month: 01, day: 23", dateFormatter);
    System.out.println(parse);
  }

}
