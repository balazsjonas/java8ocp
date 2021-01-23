package ch4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Locals {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    System.out.println("at utc: " + now.atOffset(ZoneOffset.UTC));
    System.out.println("at system: " + now.atZone(ZoneId.systemDefault()));
    System.out.println(now.withMonth(Month.APRIL.getValue()));
    System.out.println(LocalDate.of(2020, 1, 31).withMonth(2)); // 31 ->  feb.29
  }

}
