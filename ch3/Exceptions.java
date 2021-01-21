package ch3;

import java.util.Random;

public class Exceptions {

  public static void main(String[] args) throws Exception {
    simple();
    complex();
  }

  private static void simple() {
    try {
      ex();
    } catch (ExceptionA | ExceptionB e) { // catch Base class
      e.common();
    }

    try {
      ex();
    } catch (BaseException e) { // but this isn't really catching every subclasses of BaseException
      e = new ExceptionC();
      System.out.println(e);
      // throw e; // compile error
    }
  }

  public static void complex() throws Exception {
    try {
      System.out.println("try");
      int random = new Random().nextInt();
      if(random <2) {
        throw new ExceptionB();
      }
      else {
        throw new ExceptionA();
      }
    }
    catch (ExceptionA a) {
      a.printStackTrace();
      throw new ExceptionB();

    }
    catch (ExceptionB b) {
      b.printStackTrace();
    }
    finally {
      System.out.println("finally");
    }
  }

  public static void ex() throws ExceptionA, ExceptionB {
    throw new ExceptionA();
  }
}

class BaseException extends Exception {

  public void common() {
    System.out.println("BaseException::common()");
  }
}

class ExceptionA extends BaseException {
  public ExceptionA() {
    System.out.println("creating ExceptionA");
  }

  public void a() {
    System.out.println("ExceptionA::a()");
  }
}

class ExceptionB extends BaseException {

  public ExceptionB() {
    System.out.println("creating ExceptionB");
  }

  public void b() {
    System.out.println("ExceptionB:b()");
  }
}

class ExceptionC extends BaseException {
  public ExceptionC() {
    System.out.println("creating ExceptionC");
  }

  public void c() {
    System.out.println("ExceptionC:c()");
  }
}