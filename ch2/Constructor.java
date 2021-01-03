package ch2;

public class Constructor extends AbstractBase {
  public Object data = "hello";

  public Constructor() {
    System.out.println("constructor of Constructor");
    System.out.println(data.getClass());
    data = new Integer(1);
    System.out.println(data.getClass());
  }

  public static void main(String[] args) {
    new ch2.Constructor();
  }

  @java.lang.Override
  public void silly() {
    System.out.println("silly");
    System.out.println("data: "+ data);
    // System.out.println(data.getClass());
  }
}
abstract class AbstractBase {

  public AbstractBase() {
    System.out.println("constructor of AbstractBase");
    silly();
  }
  public abstract void silly();
}