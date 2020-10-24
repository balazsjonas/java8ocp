package ch1.other;

import ch1.Example2;

public class Example2Access {

  public static void main(String[] args) {
    System.out.println("hello from Example2Child");
    Example2 example2 = new Example2();
    // example2.print() not visible
    Example2Child child = new Example2Child();
    child.doSomething();
  }
}

class Example2Child extends Example2 {

  public void doSomething() {
    Example2 example2 = new Example2();
    // example2.print(); not visible
    print(); // accessible through inheritance
  }

}

class Neighbor {
  public void doSomething() {
    Example2Child child = new Example2Child();
    // child.print(); // not visible for non-child classes
  }
}