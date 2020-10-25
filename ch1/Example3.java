package ch1;

public class Example3 {

  public static void main(String[] args) {
    Box box = new Box(1);
    System.out.println(box);
    increment(box);
    System.out.println(box);
    nonFinalIncrement(box);
    System.out.println(box); // does not change the original object
  }
  public static void increment(final Box box) {
    box.setData(box.getData()+1);
  }
  public static void nonFinalIncrement(Box box) {
    box = new Box(box.getData()+1);
  }
}