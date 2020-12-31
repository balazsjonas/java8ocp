package ch2;
import java.io.IOException;

public class Overriding {

  public static void main(String[] args) throws IOException{
    Base base = new Mid();
    base.fun();

    base = new Low();
    base.fun();
  }
}

class Low extends Mid {
  public void fun() // compile error: throws IOExceptionur
  {
    System.out.println("low");
    // compile error: throw new IOException("low");
  }
}

class Mid extends Base {
  public void fun() {
    System.out.println("funny middle class");
  }
}
class Base {
  public void fun() throws IOException {
    throw new IOException();
  }
}