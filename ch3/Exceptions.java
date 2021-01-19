package ch3;


public class Exceptions {

  public static void main(String[] args) {
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

  public void a() {
    System.out.println("ExceptionA::a()");
  }
}

class ExceptionB extends BaseException {

  public void b() {
    System.out.println("ExceptionB:b()");
  }
}

class ExceptionC extends BaseException {

  public void c() {
    System.out.println("ExceptionC:c()");
  }
}