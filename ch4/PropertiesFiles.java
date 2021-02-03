package ch4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {

  public static void main(String[] args) {
    Properties numbers = new Properties();
    try(FileInputStream fis = new FileInputStream("Numbers.properties")) {
      numbers.load(fis);
      numbers.list(System.out);
      System.out.println(numbers.getProperty("one"));
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    finally {
      System.out.println("finally");
    }
    Properties properties = new Properties();
    properties.setProperty("key1", "value1");
    properties.setProperty("key2", "value2");
    properties.list(System.out);
    try(FileOutputStream fos = new FileOutputStream("Example.properties")) {
      properties.store(fos, "examples");
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    finally {

    }

  }

}
