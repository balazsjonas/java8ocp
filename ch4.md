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

* `Locale(String language)`
* `Locale(String language, String country)`

* Resource bundles
  * naming: name, name_en, name_en_CA
  * missing Locale --> fallback to default
  * missing from default --> MissingResourceException
  * property resource bundle can store only ISO 8859-1 values
    
* java resource bundles
  * must extends ListResourceBundle
  * must be on the classpath
  * can handle any classes, including String with UTF-16
* order: most specific to less specific to default locale then default bundle
  * `ListResourceBundle` is preferred over properties file 
  * ListResourceBundle and PropertyResourceBundle do not share a hierarchy
* example for "en_CA" locale:
  * Example_en_CA.java
  * Example_en_CA.properties
  * Example_en.java
  * Example_en.properties
  * default:
  * Example_hu.java
  * Example_hu.properties
  * Example.java
  * Example.properties
  
* once a resource bundle is found, java searches for a key in the hirarcy
* eg. Example_en.java exists, does not have a key --> java searches in Example.java only.
  
  
  
  
    