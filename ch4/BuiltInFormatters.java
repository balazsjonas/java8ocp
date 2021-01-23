package ch4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BuiltInFormatters {

  public static void main(String[] args) {
    LocalDate nowDate = LocalDate.now();
    LocalTime nowTime = LocalTime.now();
    LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
    System.out.println("It's currently " + nowDateTime + " where I am");
    DateTimeFormatter basicIso = DateTimeFormatter.BASIC_ISO_DATE;
    System.out.println("BasicIso:");
    System.out.println(basicIso.format(nowDate));
    // unsupported operation    System.out.println(basicIso.format(nowTime));
    System.out.println(basicIso.format(nowDateTime));
    System.out.println();

    DateTimeFormatter iso = DateTimeFormatter.ISO_DATE_TIME;
    System.out.println("iso");
    // unsupported op: System.out.println(iso.format(nowDate));
    // unsupported op: System.out.println(iso.format(nowTime));
    System.out.println(iso.format(nowDateTime));
    System.out.println();

    System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(nowDateTime) + "\n");
  }

}
