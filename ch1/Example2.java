package ch1;
public class Example2 {
  protected void print() {
    System.out.println("message from Example2");
  }
}

class NeighbourOfExample2 {
  public void doSomething() {
    Example2 example2 = new Example2();
    example2.print();
  }
}