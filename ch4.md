## Dates, Times, Locales, Resource Bundles

#### TODO

* `LocalDateTime`
* `ZonedDateTime, OffsetDateTime`
* `java.time.format.Date.TimeFormatter`
* `java.time.temporal.TemporalAdjusters`
* `java.time.temporal.ChronoUnit`
* `java.time.Period, java.Time.Duration, Instant`
* ISO-8601
* `interface TemporalAdjuster { Temporal adjustInto(Temporal temporal); }`

* ZonedDateTimes are subject to ZoneRules when being adjusted.
* `ZoneId.of("GMT+x")`
* `Period.between(jan31, jan31.plusMonths(1))` --> 28 d
* `Period.between(jan31, jan31.plusDays(30))` --> 1M 2D

* `System.out.println(cestStart);`
* `System.out.println(cestStart.plus(Period.ofDays(1)));` +1 nap ugyanaz az óra
* `System.out.println(cestStart.plus(Duration.ofDays(1)));` + 24 óra (Zona szerint)