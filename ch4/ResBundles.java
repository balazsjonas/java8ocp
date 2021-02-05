package ch4;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ResBundles {

  public static void main(String[] args) {
    ResourceBundle numbers = ResourceBundle.getBundle("Numbers", Locale.ENGLISH);
    System.out.println("English");
    System.out.println(numbers.getString("1"));
    // System.out.println(numbers.getString("123")); // MissingResourceException
    System.out.println();

    ResourceBundle canadian = ResourceBundle.getBundle("Numbers", Locale.CANADA);
    System.out.println("Canadian");
    System.out.println(canadian.getString("1"));
    System.out.println(canadian.getString("5"));
    System.out.println(canadian.getString("6"));
    System.out.println();

    ResourceBundle german = ResourceBundle.getBundle("Numbers", Locale.GERMAN);
    System.out.println("German");
    System.out.println(german.getString("1"));
    System.out.println(german.getString("2"));
    System.out.println(german.getString("3"));
    System.out.println();

    ResourceBundle defaultLocale = ResourceBundle.getBundle("Numbers");
    System.out.println("default locale");
    System.out.println(defaultLocale.getString("1"));
    System.out.println();

    ResourceBundle numbers1 = ResourceBundle.getBundle("Numbers", Locale.CHINA);
    System.out.println("Missing locale --> fallback to default");
    System.out.println(numbers1.getString("1"));
  }

}
